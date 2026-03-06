package com.vishwas.lld.designPatterns.creationalPatterns.FactoryDesignPattern.goodCode;

public class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck is starting");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopping");
    }
}
