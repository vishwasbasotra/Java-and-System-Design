package com.vishwas.java.multithreading.synchronization;

public class SynchronizationDemo {
    // We use 'synchronized' in the method signature to lock the entire method
    public static synchronized void display(String str){
        // This loop is our Critical Section
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            try {
                // Small sleep to demonstrate that even while paused,
                // the thread holds the lock (Mutual Exclusion)
                Thread.sleep(100);
            }catch (Exception e){

            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> display("Hello World!"), "Thread-1");
        Thread t2 = new Thread(() -> display("Welcome!"), "Thread-2");

        t1.start();
        t2.start();
    }
}
