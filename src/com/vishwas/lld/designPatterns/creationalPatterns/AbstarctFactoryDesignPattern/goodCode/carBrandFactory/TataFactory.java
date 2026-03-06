package com.vishwas.lld.designPatterns.creationalPatterns.AbstarctFactoryDesignPattern.goodCode.carBrandFactory;


import com.vishwas.lld.designPatterns.creationalPatterns.AbstarctFactoryDesignPattern.goodCode.Tata;
import com.vishwas.lld.designPatterns.creationalPatterns.AbstarctFactoryDesignPattern.goodCode.Vehicle;
import com.vishwas.lld.designPatterns.creationalPatterns.AbstarctFactoryDesignPattern.goodCode.VehicleFactory;

public class TataFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Tata();
    }
}

