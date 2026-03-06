package com.vishwas.lld.designPatterns.creationalPatterns.AbstarctFactoryDesignPattern.goodCode.carBrandFactory;


import com.vishwas.lld.designPatterns.creationalPatterns.AbstarctFactoryDesignPattern.goodCode.Toyota;
import com.vishwas.lld.designPatterns.creationalPatterns.AbstarctFactoryDesignPattern.goodCode.Vehicle;
import com.vishwas.lld.designPatterns.creationalPatterns.AbstarctFactoryDesignPattern.goodCode.VehicleFactory;

public class ToyotaFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Toyota();
    }
}

