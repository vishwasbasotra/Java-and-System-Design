package com.vishwas.java.oops.interfaces.extendDemo;

public class Main implements car {

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public void start() {
        System.out.println("Car is starting");

    }

}
