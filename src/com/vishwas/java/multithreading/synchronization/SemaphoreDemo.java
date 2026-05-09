package com.vishwas.java.multithreading.synchronization;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    // 1. Initialize with 2 permits (The 'Printer slot' size)
    private static final Semaphore printerSlots = new Semaphore(2);
    public static void main(String[] args) {
        Runnable task = () -> {
            String name = Thread.currentThread().getName();
            try {
                System.out.println(name+" is waiting for the printer slot");

                // 2. Try to get a permit. Blocks if 0 permits are left.
                printerSlots.acquire();

                System.out.println(name+" got the slot, now printing");
                Thread.sleep(2000);   // Simulate the work
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            } finally {
                // 3. Always release so others can use the slot
                System.out.println(name+" is releasing the printer slot");
                printerSlots.release();
            }
        };

        // Spawning 5 threads to compete for only 2 slots
        for (int i = 1; i <= 5; i++) {
            new Thread(task, "Thread-"+i).start();
        }
    }
}
