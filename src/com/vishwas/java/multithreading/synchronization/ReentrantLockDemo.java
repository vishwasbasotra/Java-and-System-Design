package com.vishwas.java.multithreading.synchronization;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    // Explicit lock object to manage the shared resource
    private final ReentrantLock lock = new ReentrantLock();

    public void accessResource() {
        try{
            // Attempt to acquire the lock for 1 second
            if (lock.tryLock()){
                try {
                    // --- Critical Section Start ---
                    System.out.println(Thread.currentThread().getName()+" is accessing the data.");
                    Thread.sleep(500);// Simulate processing
                    // --- Critical Section End ---
                }finally {
                    // Always release the lock to prevent starvation
                    System.out.println(Thread.currentThread().getName()+" releasing the lock.");
                    lock.unlock();
                }
            }else{
                // Deadlock Prevention: Do not wait forever if resource is busy
                System.out.println(Thread.currentThread().getName()+" could not get the lock. Moving on...");
            }
        }catch (InterruptedException e){
            // Handle if the thread is interrupted while waiting
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        ReentrantLockDemo reentrantLockDemo = new ReentrantLockDemo();
        Thread t1 = new Thread(() -> reentrantLockDemo.accessResource(), "Thread-1");
        Thread t2 = new Thread(() -> reentrantLockDemo.accessResource(), "Thread-2");

        t1.start();
        t2.start();
    }
}
