package com.vishwas.lld.projects.parkingLot.model;

import com.vishwas.lld.projects.parkingLot.enums.VehicleType;

public class Bike extends Vehicle{
    public Bike(String vehicleNumber) {
        super(vehicleNumber, VehicleType.BIKE);
    }
}
