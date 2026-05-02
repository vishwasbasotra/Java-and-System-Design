package com.vishwas.java.multithreading.methods;

public class Interrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread worker =  new Thread(() -> {
            try{
                Thread.sleep(10000);
            }catch (InterruptedException e){
                System.out.println("Worker interrupted");
                return;
            }
        }, "Worker");

        worker.start();
        Thread.sleep(100);
        System.out.println("Main: Interrupting worker");
        worker.interrupt();
        System.out.println(worker.isInterrupted());
    }
}
