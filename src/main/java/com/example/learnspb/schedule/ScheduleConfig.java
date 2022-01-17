package com.example.learnspb.schedule;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class ScheduleConfig {

    private Logger logger = LogManager.getLogger("log");

    @Scheduled(cron = "0 0/1 * * * ?")
    public void job() {
        logger.info("this is a job!");
    }

}
