package com.vishwas.lld.designPatterns.creationalPatterns.AbstarctFactoryDesignPattern.goodCode;

import com.vishwas.lld.designPatterns.creationalPatterns.AbstarctFactoryDesignPattern.goodCode.carBrandFactory.HondaFactory;
import com.vishwas.lld.designPatterns.creationalPatterns.AbstarctFactoryDesignPattern.goodCode.carBrandFactory.TataFactory;
import com.vishwas.lld.designPatterns.creationalPatterns.AbstarctFactoryDesignPattern.goodCode.carBrandFactory.ToyotaFactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory tataFactory = new TataFactory();
        Vehicle vehicle1 = tataFactory.createVehicle();
        vehicle1.start();
        vehicle1.stop();

        VehicleFactory hondaFactory = new HondaFactory();
        Vehicle vehicle2 = hondaFactory.createVehicle();
        vehicle2.start();
        vehicle2.stop();

        VehicleFactory toyotaFactory = new ToyotaFactory();
        Vehicle vehicle3 = toyotaFactory.createVehicle();
        vehicle3.start();
        vehicle3.stop();
    }
}
