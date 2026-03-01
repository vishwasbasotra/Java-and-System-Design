package com.vishwas.lld.designPrinciples.SOLID.III_LiskovSubstitutionPrinciple.goodCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. Create a list of the base type 'Vehicle'
        List<Vehicle> myGarage = new ArrayList<>();


        // 2. Add different types of vehicles
        // Note: Both Car and Bicycle "are" Vehicles (Substitution)

        myGarage.add(new Car());
        myGarage.add(new Bicycyle());

        for(Vehicle v: myGarage){
            // Check if the vehicle has an engine before trying to start it
            // This prevents the runtime crash from the "Bad" example
            if(v instanceof EngineVehicle)  ((EngineVehicle) v).startEngine();

            // Every Vehicle is guaranteed to have a move() method
            v.move();
            System.out.println("---------------------------");
        }
    }
}
