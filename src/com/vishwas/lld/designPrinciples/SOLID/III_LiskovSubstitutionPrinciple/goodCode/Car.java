package com.vishwas.lld.designPrinciples.SOLID.III_LiskovSubstitutionPrinciple.goodCode;

public class Car extends EngineVehicle{
    @Override
    void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
