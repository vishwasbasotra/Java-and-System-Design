package com.vishwas.java.multithreading.states;

public class BlockedState {
    // Shared resource with a synchronized method to demonstrate Mutual Exclusion
    public synchronized void sharedResource(){
        while (true){
            // Infinite loop to ensure this thread never releases the lock
            // This forces any other thread trying to enter to stay BLOCKED
        }
    }
    public static void main(String[] args) throws InterruptedException {
        BlockedState blockedState = new BlockedState();

        Thread t1 = new Thread(() -> blockedState.sharedResource(), "Thread-1");
        Thread t2 = new Thread(() -> blockedState.sharedResource(), "Thread-2");

        t1.start();
        // Small delay to ensure t1 grabs the lock first
        Thread.sleep(1000);

        t2.start();
        // Small delay to allow t2 to attempt (and fail) to get the lock
        Thread.sleep(1000);

        // t1 is RUNNING because it holds the monitor
        // t2 is BLOCKED because it's waiting for t1 to release the 'synchronized' lock
        System.out.println(t2.getName()+" State: "+t2.getState());
    }
}
