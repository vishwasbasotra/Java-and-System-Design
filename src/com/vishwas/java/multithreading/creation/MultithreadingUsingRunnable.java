package com.vishwas.java.multithreading.creation;

public class MultithreadingUsingRunnable implements Runnable{

    @Override
    public void run(){
        int i = 0;
        while(i++ < 10){
            System.out.println("Hello from: " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        MultithreadingUsingRunnable myRunnable = new MultithreadingUsingRunnable();
        Thread thread = new Thread(myRunnable);   //NEW
        thread.start();    //RUNNABLE

        int i = 0;
        while(i++ < 10){
            System.out.println("Hello from: " + Thread.currentThread().getName());
        }
    }

}
