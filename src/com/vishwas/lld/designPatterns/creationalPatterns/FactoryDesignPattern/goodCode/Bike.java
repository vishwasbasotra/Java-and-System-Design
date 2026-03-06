package com.vishwas.lld.designPatterns.creationalPatterns.FactoryDesignPattern.goodCode;

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping...");
    }
}
