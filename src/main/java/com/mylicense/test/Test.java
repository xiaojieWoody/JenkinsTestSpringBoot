package com.mylicense.test;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.concurrent.BasicThreadFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;

@Slf4j
public class Test {

    public static void init() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:MM:ss");
        ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(1,
                new BasicThreadFactory.Builder().namingPattern("example-schedule-pool-%d").daemon(true).build());
        ScheduledFuture<?> scheduledFuture = executorService.scheduleAtFixedRate(() -> {
            System.out.println("out定时任务：............" + sdf.format(new Date()));
            log.warn("log定时任务：............" + sdf.format(new Date()));
        }, 0, 1L, TimeUnit.SECONDS);
        try {
            Object o = scheduledFuture.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
