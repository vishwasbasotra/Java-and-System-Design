package com.vishwas.lld.designPatterns.creationalPatterns.AbstarctFactoryDesignPattern.goodCode.carBrandFactory;


import com.vishwas.lld.designPatterns.creationalPatterns.AbstarctFactoryDesignPattern.goodCode.Honda;
import com.vishwas.lld.designPatterns.creationalPatterns.AbstarctFactoryDesignPattern.goodCode.Vehicle;
import com.vishwas.lld.designPatterns.creationalPatterns.AbstarctFactoryDesignPattern.goodCode.VehicleFactory;

public class HondaFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Honda();
    }
}

