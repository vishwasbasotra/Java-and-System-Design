package com.vishwas.java.multithreading.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WorkStealingPool {
    public static void main(String[] args) throws InterruptedException {
        // Uses parallelism level based on available CPU cores
        ExecutorService executorService = Executors.newWorkStealingPool();

        for (int i = 0; i < 4; i++) {
            executorService.submit(() -> {
                System.out.println("Work Stealing Task running on " + Thread.currentThread().getName());
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.SECONDS);
    }
}
