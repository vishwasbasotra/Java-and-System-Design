package com.vishwas.java.multithreading.executorFramework;

import java.util.concurrent.*;

public class CallableAndFuture {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // 1. Define a task that returns a String
        Callable<String> task = () -> {
            System.out.println("Processing data in background...");
            Thread.sleep(3000); //simulating heavy work
            return "Task Completed";
        };

        // 2. Submit the task and get a Future object back immediately
        System.out.println("Submitting the task...");
        Future<String> future = executorService.submit(task);

        // 3. Do other work while the task runs
        System.out.println("Main thread is free to other work...");

        try{
            // 4. Retrieve the result. This will block until the 2s sleep is over.
            // You can also use future.get(1, TimeUnit.SECONDS) for a timed wait.
            String result = future.get();
            System.out.println("Result received: "+result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
        System.out.println("Main thread reached end of the program");
    }
}
