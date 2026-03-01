package com.vishwas.lld.designPatterns.creationalPatterns.factoryDesignPattern.goodCode;

class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopping...");
    }
}
