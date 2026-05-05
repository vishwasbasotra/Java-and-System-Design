package com.vishwas.java.multithreading.synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockDemo {
    private int count = 0;
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final Lock readLock = readWriteLock.readLock();
    private final Lock writeLock = readWriteLock.writeLock();

    public void readContent(){
        readLock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" acquiring the read lock");
            System.out.println(Thread.currentThread().getName()+" is reading count: "+count);
        }finally {
            System.out.println(Thread.currentThread().getName()+" is releasing the read lock");
            readLock.unlock();
        }
    }

    public void writeContent(){
        writeLock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" acquiring the write lock");
            this.count++;
            System.out.println(this.count);
        }finally {
            System.out.println(Thread.currentThread().getName()+" is releasing the write lock");
            writeLock.unlock();
        }
    }
    public static void main(String[] args) {
        ReadWriteLockDemo readWriteLockDemo = new ReadWriteLockDemo();
        Thread reader1 = new Thread(() -> readWriteLockDemo.readContent(), "Reader-1");
        Thread reader2 = new Thread(() -> readWriteLockDemo.readContent(), "Reader-2");
        Thread writer1 = new Thread(() -> readWriteLockDemo.writeContent(), "Writer-1");
        Thread writer2 = new Thread(() -> readWriteLockDemo.writeContent(), "Writer-2");

        writer1.start();
        reader1.start();
        reader2.start();
        writer2.start();
    }
}
