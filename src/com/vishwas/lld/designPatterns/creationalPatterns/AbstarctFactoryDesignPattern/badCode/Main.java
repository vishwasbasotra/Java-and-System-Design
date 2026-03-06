package com.vishwas.lld.designPatterns.creationalPatterns.AbstarctFactoryDesignPattern.badCode;

public class Main {
    public static void main(String[] args) {
        //CarFactory factory = new CarFactory();
        Vehicle vehicle1 = CarFactory.createVehicle("Honda");
        vehicle1.start();
        vehicle1.stop();

        Vehicle vehicle2 = CarFactory.createVehicle("Tata");
        vehicle2.start();
        vehicle2.stop();

        Vehicle vehicle3 = CarFactory.createVehicle("Toyota");
        vehicle3.start();
        vehicle3.stop();
    }
}
