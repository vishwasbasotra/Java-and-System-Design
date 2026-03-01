package com.vishwas.lld.designPrinciples.SOLID.III_LiskovSubstitutionPrinciple.badCode;

public class Vehicle {
    public void startEngine(){
        System.out.println("Starting the engine...");
    }
}

class Car extends Vehicle{
    @Override
    public void startEngine(){
        super.startEngine();
    }
}

class Bicycle extends Vehicle{
    @Override
    public void startEngine(){
        // VIOLATION: A bicycle has no engine!
        throw new UnsupportedOperationException("Bicycles don't have engines");
    }
}
class Main{
    public static void main(String[] args) {
        // Creating objects of different subclasses
        // Using polymorphism
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();
        car.startEngine();
        try {
            bicycle.startEngine();  // Throws UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

