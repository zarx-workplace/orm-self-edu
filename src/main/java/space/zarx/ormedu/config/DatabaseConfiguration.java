package space.zarx.ormedu.config;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

@Configuration
public class DatabaseConfiguration {

    protected DataSource dataSource;

    @Autowired
    protected void initDB(
            @Value("classpath:properties/db.properties") Resource dbprops) throws IOException, SQLException {
        Properties properties = new Properties();
        try (InputStream is = dbprops.getInputStream()) {
            properties.load(is);
        }

        checkAndCreateTestUserAndDatabase(properties);

        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(properties.getProperty("datasource.db.driver.classname"));
        ds.setUrl(getJdbcUrl(properties, properties.getProperty("datasource.db.user")));
        ds.setUsername(properties.getProperty("datasource.db.user"));
        ds.setPassword(properties.getProperty("datasource.db.pass"));
        this.dataSource = ds;

        Flyway flyway = new Flyway();
        flyway.setDataSource(this.dataSource);
        flyway.setLocations("classpath:properties");
        flyway.setBaselineOnMigrate(true);
//        flyway.migrate();

    }

    private void checkAndCreateTestUserAndDatabase(Properties properties) throws SQLException {
        DriverManagerDataSource initConnFactory = new DriverManagerDataSource();
        initConnFactory.setDriverClassName(properties.getProperty("datasource.db.driver.classname"));
        initConnFactory.setUrl(getJdbcUrl(properties, properties.getProperty("datasource.db.superdbname")));
        initConnFactory.setUsername(properties.getProperty("datasource.db.superuser"));
        initConnFactory.setPassword(properties.getProperty("datasource.db.superpass"));

        try (Connection connection = initConnFactory.getConnection()) {
            // Check if test user exists
            ResultSet userCheck = connection.prepareStatement(
                    String.format("SELECT 1 FROM pg_catalog.pg_user WHERE usename = '%s'",
                            properties.getProperty("datasource.db.user"))).executeQuery();
            int userCount = 0;
            while (userCheck.next()) {
                userCount++;
            }
            if (userCount < 1) {
                connection.prepareStatement(String.format("CREATE ROLE %s LOGIN PASSWORD '%s'",
                        properties.getProperty("datasource.db.user"),
                        properties.getProperty("datasource.db.pass"))).executeQuery();
            }

            // Check if test database exists
            ResultSet databaseCheck = connection.prepareStatement(
                    String.format("SELECT 1 FROM pg_database WHERE datname = '%s';",
                            properties.getProperty("datasource.db.dbname"))).executeQuery();
            int dbCount = 0;
            while (databaseCheck.next()) {
                dbCount++;
            }
            if (dbCount < 1) {
                connection.prepareStatement(String.format("CREATE DATABASE %s OWNER %s",
                        properties.getProperty("datasource.db.dbname"),
                        properties.getProperty("datasource.db.user"))).executeQuery();
            }
        }
    }

    private static String getJdbcUrl(Properties properties, String username) {
        return "jdbc:postgresql://" + properties.getProperty("datasource.db.host")
                + ":" + properties.getProperty("datasource.db.port")
                + "/" + username + "?autoReconnect=true";
    }

}
