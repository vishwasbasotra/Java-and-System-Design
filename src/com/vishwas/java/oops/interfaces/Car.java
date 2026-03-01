package com.vishwas.java.oops.interfaces;

public class Car implements Engine, Brake, Media {
    @Override
    public void brake() {
        System.out.println("Car is braking");
    }

    @Override
    public void start() {
        System.out.println("Car engine is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car engine is stopping");
    }

    @Override
    public void acc() {
        System.out.println("Car is accelerating");
    }
}
