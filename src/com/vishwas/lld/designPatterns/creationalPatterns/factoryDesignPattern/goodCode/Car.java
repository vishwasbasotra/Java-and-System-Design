package com.vishwas.lld.designPatterns.creationalPatterns.factoryDesignPattern.goodCode;

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }
}
