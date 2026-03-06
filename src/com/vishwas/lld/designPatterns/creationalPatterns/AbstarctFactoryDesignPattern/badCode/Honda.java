package com.vishwas.lld.designPatterns.creationalPatterns.AbstarctFactoryDesignPattern.badCode;

public class Honda implements Vehicle{

    @Override
    public void start() {
        System.out.println("Honda car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Honda car is stopping");
    }
}
