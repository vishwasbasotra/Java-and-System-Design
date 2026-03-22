package com.vishwas.lld.projects.parkingLot.model;

import com.vishwas.lld.projects.parkingLot.enums.ParkingSlotType;
import com.vishwas.lld.projects.parkingLot.enums.ParkingSpaceStatus;
import com.vishwas.lld.projects.parkingLot.enums.VehicleType;

public class CompactSlot extends ParkingSlot{
    public CompactSlot(String parkingSlotId, int row, int col) {
        super(parkingSlotId, ParkingSlotType.COMPACT, row, col);
    }

    @Override
    public boolean canFit(Vehicle vehicle){
        return vehicle.getVehicleType() == VehicleType.BIKE ||
                vehicle.getVehicleType() == VehicleType.SCOOTER;
    }
}
