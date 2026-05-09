package com.vishwas.java.multithreading.synchronization;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class countDownLatchDemo {
    public static void main(String[] args) {
        // 1. Initialize with 3 (Wait for 3 services)
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        String[] services = {"Database", "Messaging", "Cache"};

        // countDown() will decrement only two times making it in an infinite loop
        //String[] services = {"Database", "Messaging"};

        for(String service: services){
            executorService.submit(()->{
                try {
                    System.out.println(service+" is initializing...");
                    Thread.sleep(2000);
                    System.out.println(service+" is UP.");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    // 2. Decrement the counter
                    countDownLatch.countDown();
                }
            });
        }

        try{
            System.out.println("Main thread waiting for services to be ready...");
            countDownLatch.await();

            // countDownLatch waits for only 10 secs and then open the latch and continue ahead
            //countDownLatch.await(10, TimeUnit.SECONDS);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        } finally {
            System.out.println("All services are UP. Starting Application!.");
            executorService.shutdown();
        }

    }
}
