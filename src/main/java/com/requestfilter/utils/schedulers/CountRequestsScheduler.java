package com.requestfilter.utils.schedulers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class CountRequestsScheduler {
//    ToDo add to properties file the string.
    private String schedulerName = "CountRequestsScheduler";

    private static final Logger log = LoggerFactory.getLogger(CountRequestsScheduler.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

//    Runs every Hour
    @Scheduled(fixedRate = 3_600_000)
    public void reportCurrentTime() {
        log.info("Scheduler started {} : {}",schedulerName,  dateFormat.format(new Date()));
//        Get id of the scheduler
//        Find most recent last_id from scheduled_operation if exist relevant to the scheduler.

//        Check if there is last_id + 1 in the requests table
//        If there is add


    }
}
