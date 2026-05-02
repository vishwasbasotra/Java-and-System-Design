package com.vishwas.java.multithreading.methods;

public class Yield {
    public static void main(String[] args) {
        Runnable task = () ->{
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName()+": Running item "+i);
                Thread.yield();
            }
        };

        Thread t1 = new Thread(task, "Thread-High");
        Thread t2 = new Thread(task, "Thread-Low");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }

}
