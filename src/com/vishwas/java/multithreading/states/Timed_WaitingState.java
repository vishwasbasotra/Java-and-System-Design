package com.vishwas.java.multithreading.states;

public class Timed_WaitingState implements Runnable{
    @Override
    public void run() {
        //System.out.println(Thread.currentThread().getName());   // child thread
        System.out.println("Child Thread: RUNNING");
        try {
            Thread.sleep(2000); // pausing the child thread
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Timed_WaitingState timedWaitingState = new Timed_WaitingState();

        System.out.println(Thread.currentThread().getName());   // main thread

        Thread thread1 = new Thread(timedWaitingState);// NEW
        System.out.println(thread1.getState()); // NEW

        thread1.start();   //RUNNABLE
        System.out.println(thread1.getState()); //RUNNABLE

        Thread.sleep(1000); //pausing the main thread so that child thread get the CPU for execution
        System.out.println(thread1.getState());     //TIMED_WAITING - because when main thread tried to get
                                                    // the state of child thread it is paused for 2000 ms.

        thread1.join(); //main method is waiting for child thread to complete its execution and then continue
        System.out.println(Thread.currentThread().getState());
        System.out.println(thread1.getState()); //TERMINATED

    }
}
