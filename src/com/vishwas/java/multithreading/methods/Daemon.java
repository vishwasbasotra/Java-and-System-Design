package com.vishwas.java.multithreading.methods;

public class Daemon {
    public static void main(String[] args) throws InterruptedException {
        Thread helper = new Thread(() ->{
            while (true){
                System.out.println("Daemon: Monitoring system health in the background");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    break;
                }
            }
        });

        helper.setDaemon(true);
        helper.start();

        System.out.println("Main: Starting a 2 second task...");
        Thread.sleep(2000);
        System.out.println("Main: Task is finished. THe JVM will now exit and kill the Daemon");
    }

}
