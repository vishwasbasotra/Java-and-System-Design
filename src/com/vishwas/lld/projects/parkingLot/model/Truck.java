package com.vishwas.lld.projects.parkingLot.model;

import com.vishwas.lld.projects.parkingLot.enums.VehicleType;

public class Truck extends Vehicle{
    public Truck(String vehicleNumber) {
        super(vehicleNumber, VehicleType.TRUCK);
    }
}
