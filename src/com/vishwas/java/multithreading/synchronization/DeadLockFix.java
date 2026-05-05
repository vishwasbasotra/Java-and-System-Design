package com.vishwas.java.multithreading.synchronization;

public class DeadLockFix {
    private static Object pen = new Object();
    private static Object paper = new Object();

    void writeTask(){
        synchronized (pen){
            System.out.println(Thread.currentThread().getName()+" has the pen now, need paper to write.");

            synchronized (paper){
                System.out.println(Thread.currentThread().getName()+" now have both pen and paper, now i can write.");
            }
        }
    }

    public static void main(String[] args) {
        DeadLockFix deadLockFix = new DeadLockFix();
        Thread alice = new Thread(() -> deadLockFix.writeTask(), "alice");
        Thread bob = new Thread(() -> deadLockFix.writeTask(), "bob");

        alice.start();
        bob.start();
    }
}
