package space.zarx.ormedu.services.environment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentMgr {

    private static final Logger logger = LoggerFactory.getLogger(EnvironmentMgr.class);

    @Autowired
    public void init() {
        Thread keepalive = new Thread(() -> {
            int counter = 0;
            while (true) {
                logger.info(String.valueOf(counter++));
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    logger.error("Error during keep alive procedure", e);
                }
            }
        });

        logger.info("init!");
        keepalive.start();
    }
}
