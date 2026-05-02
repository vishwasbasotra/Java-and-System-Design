package com.vishwas.java.multithreading.synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockDemo {
    private String content = "Initial Content";
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final Lock readLock = readWriteLock.readLock();
    private final Lock writeLock = readWriteLock.writeLock();

    public void readContent(){
        readLock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" acquiring the read lock");
            System.out.println(Thread.currentThread().getName()+" is reading: "+content);
        }finally {
            System.out.println(Thread.currentThread().getName()+" is releasing the read lock");
            readLock.unlock();
        }
    }

    public void writeContent(String newContent){
        writeLock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" acquiring the write lock");
            this.content = newContent;
        }finally {
            System.out.println(Thread.currentThread().getName()+" is releasing the write lock");
            writeLock.unlock();
        }
    }
    public static void main(String[] args) {
        ReadWriteLockDemo readWriteLockDemo = new ReadWriteLockDemo();
        Thread reader1 = new Thread(() -> readWriteLockDemo.readContent(), "Reader-1");
        Thread reader2 = new Thread(() -> readWriteLockDemo.readContent(), "Reader-2");
        Thread writer = new Thread(() -> readWriteLockDemo.writeContent("New Content"), "Writer-3");

        reader1.start();
        reader2.start();
        writer.start();
    }
}
