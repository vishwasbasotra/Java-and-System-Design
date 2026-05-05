package com.vishwas.java.multithreading.synchronization;

public class DeadlockExample {
    // These represent our shared resources in the Heap
    public static Object pen = new Object();
    public static Object paper = new Object();

    public static void main(String[] args) {
        // Alice's Thread
        Thread alice = new Thread(() -> {
            // Alice acquires the Pen first
            synchronized (pen) {
                System.out.println("Alice: I have the Pen. Now I need the Paper.");

                // Small delay to ensure Bob has time to grab the Paper
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                // Alice tries to acquire the Paper while still holding the Pen
                synchronized (paper) {
                    System.out.println("Alice: I have both! Writing...");
                }
            }
        });

        // Bob's Thread
        Thread bob = new Thread(() -> {
            // Bob acquires the Paper first
            synchronized (paper) {
                System.out.println("Bob: I have the Paper. Now I need the Pen.");

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                // Bob tries to acquire the Pen while still holding the Paper
                synchronized (pen) {
                    System.out.println("Bob: I have both! Writing...");
                }
            }
        });

        alice.start();
        bob.start();
    }
}