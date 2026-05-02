package com.vishwas.java.multithreading.creation;

public class MultithreadingUsingThreadClass extends Thread{

    @Override
    public void run(){
        int i = 0;
        while(i++ < 10){
            System.out.println("Hello from: " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        MultithreadingUsingThreadClass thead1 = new MultithreadingUsingThreadClass();
        thead1.start();

        int i = 0;
        while(i++ < 10){
            System.out.println("Hello from: " + Thread.currentThread().getName());
        }
    }
}
