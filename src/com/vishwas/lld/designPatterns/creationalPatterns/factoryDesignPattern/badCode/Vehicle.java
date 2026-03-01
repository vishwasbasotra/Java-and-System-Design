package com.vishwas.lld.designPatterns.creationalPatterns.factoryDesignPattern.badCode;

public interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopoing...");
    }
}

class Truck implements Vehicle{
    @Override
    public void start() {
        System.out.println("Truck is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopping...");
    }
}

class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping...");
    }
}

class Main{
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();

        Vehicle truck = new Truck();
        truck.start();
        truck.stop();

        Vehicle bike = new Bike();
        bike.start();
        bike.stop();
    }
}
