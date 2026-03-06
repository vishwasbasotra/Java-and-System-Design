package com.vishwas.lld.designPatterns.creationalPatterns.AbstarctFactoryDesignPattern.badCode;

public class CarFactory {
    public static Vehicle createVehicle(String vehicleType){
        if(vehicleType.equals("Toyota"))    return new Toyota();
        else if(vehicleType.equals("Honda"))    return new Honda();
        else if (vehicleType.equals("Tata"))    return new Tata();
        else throw new IllegalArgumentException("Unknown Vehicle Type");
    }
}
