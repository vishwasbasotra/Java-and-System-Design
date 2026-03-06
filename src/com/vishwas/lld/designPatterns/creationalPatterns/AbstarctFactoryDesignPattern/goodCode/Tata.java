package com.vishwas.lld.designPatterns.creationalPatterns.AbstarctFactoryDesignPattern.goodCode;

public class Tata implements Vehicle {

    @Override
    public void start() {
        System.out.println("Tata car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Tata car is stopping");
    }
}
