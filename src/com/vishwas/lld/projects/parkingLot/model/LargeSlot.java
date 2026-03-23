package com.vishwas.lld.projects.parkingLot.model;

import com.vishwas.lld.projects.parkingLot.enums.ParkingSlotType;
import com.vishwas.lld.projects.parkingLot.enums.VehicleType;

public class LargeSlot extends ParkingSlot{
    public LargeSlot(String id) {
        super(id, ParkingSlotType.LARGE);
    }

    @Override
    public boolean canFit(Vehicle vehicle){
        return vehicle.getVehicleType() == VehicleType.TUCK ||
                vehicle.getVehicleType() == VehicleType.CAR;
    }
}
