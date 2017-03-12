package space.zarx.ormedu.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan(basePackages = {"space.zarx.ormedu"})
@EnableScheduling
public class AppInit {

    private static final Logger logger = LoggerFactory.getLogger(AppInit.class);

    public static void main(String[] args) {
        logger.info("Application init - main. START.");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppInit.class);
    }
}
