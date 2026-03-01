package com.vishwas.java.oops.interfaces;

public class ICEEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopped");
    }

    @Override
    public void acc() {
        System.out.println("Car accelerating");
    }
}
