package com.vishwas.java.multithreading.synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockFairness {
    private final Lock lock = new ReentrantLock(true);

    public void accessResource() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired the lock");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println(Thread.currentThread().getName()+" releasing the lock");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        LockFairness lockFairness = new LockFairness();
        Thread t1 = new Thread(()-> lockFairness.accessResource(), "Thread-1");
        Thread t2 = new Thread(()-> lockFairness.accessResource(), "Thread-2");
        Thread t3 = new Thread(()-> lockFairness.accessResource(), "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
