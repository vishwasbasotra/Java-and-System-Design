package com.vishwas.java.multithreading.executorFramework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);

        scheduledExecutorService.schedule(() -> {
            System.out.println("Delayed tasked execution");
        }, 3, TimeUnit.SECONDS);

        scheduledExecutorService.scheduleAtFixedRate(() ->
        {
            System.out.println("Fixed Rate Delayed Task Execution");
        }, 1, 5, TimeUnit.SECONDS);
    }
}
