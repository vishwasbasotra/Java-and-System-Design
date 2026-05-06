package com.vishwas.java.multithreading.communication;

// The shared object where communication happens
class SharedResource {
    private int data;
    // true = Producer's turn, false = Consumer's turn
    private boolean producersTurn = true;

    // Synchronized 'set' method for the Producer
    public synchronized void set(int value){
        // Use a loop to check the turn; if not producer's turn, wait
        while(!producersTurn){
            try{
                wait(); // Releases the lock and enters WAITING state
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.data = value;
        System.out.println("Produced: "+this.data);
        // Change turn to Consumer and notify them
        producersTurn = false;
        notify();   // Wakes up the waiting Consumer
    }

    // Synchronized 'get' method for the Consumer
    public synchronized void get(){
        // If it is still the producer's turn, the consumer must wait
        while(producersTurn){
            try{
                wait(); // Releases the lock and enters WAITING state
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumed: "+this.data);
        // Change turn back to Producer and notify them
        producersTurn = true;
        notify();   // Wakes up the waiting Producer
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Producer thread[cite: 1]
        Thread producer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.set(i);
            }
        });
        // Consumer thread[cite: 1]
        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.get();
            }
        });

        producer.start();
        consumer.start();
    }
}