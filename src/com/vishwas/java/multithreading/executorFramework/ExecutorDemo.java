package com.vishwas.java.multithreading.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 10; i++) {
            int taskId = i;
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName()+" is running task id: "+ taskId);
            });
        }
        executorService.shutdown();
    }
}
