package com.vishwas.lld.designPrinciples.SOLID.III_LiskovSubstitutionPrinciple.goodCode;

public class Bicycyle extends NonEngineVehicle{
    @Override
    public void move() {
        System.out.println("Bicycle is moving");
    }
}
