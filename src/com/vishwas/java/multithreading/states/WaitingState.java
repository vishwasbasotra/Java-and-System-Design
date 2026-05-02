package com.vishwas.java.multithreading.states;

public class BlockedState {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(() -> {
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            try{
                t1.join();
                System.out.println("Thread-2: Thread-1 is done, now i can finish my task.");
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }, "Thread-2");

        t1.start();
        Thread.sleep(100);
        t2.start();

        Thread.sleep(100);
        System.out.println(t2.getName()+" State: "+t2.getState());
    }
}
