package com.vishwas.java.multithreading.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 1; i < 10; i++) {
            int taskId = i;
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " is running task id: " + taskId);
            });
        }
        executorService.shutdown();
    }
}
