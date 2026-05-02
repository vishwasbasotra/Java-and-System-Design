package com.vishwas.java.multithreading.priority;

public class Priority {
    static void execute() {
        // Increased loop count to make the CPU actually "work"
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + " is running...");
        }
    }

    // Fixed the method signature to be a valid entry point
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> execute(), "LOW-PRIORITY");
        Thread t2 = new Thread(() -> execute(), "MEDIUM-PRIORITY");
        Thread t3 = new Thread(() -> execute(), "HIGH-PRIORITY");

        // Setting levels: 1, 5, and 10 [cite: 127, 128, 129]
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
