package com.vishwas.lld.projects.parkingLot.model;

import com.vishwas.lld.projects.parkingLot.enums.ParkingSlotType;
import com.vishwas.lld.projects.parkingLot.enums.ParkingSpaceStatus;

public abstract class ParkingSlot {
    private static long parkingSlotId = 0;
    private ParkingSpaceStatus parkingSpaceStatus;
    private ParkingSlotType parkingSlotType;

    public ParkingSlot(ParkingSlotType parkingSlotType) {
        parkingSlotId += 1;
        this.parkingSpaceStatus = ParkingSpaceStatus.AVAILABLE;
        this.parkingSlotType = parkingSlotType;
    }
    public abstract boolean canFit(Vehicle vehicle);
}
