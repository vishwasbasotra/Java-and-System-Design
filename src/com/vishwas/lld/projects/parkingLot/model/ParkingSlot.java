package com.vishwas.lld.projects.parkingLot.model;

import com.vishwas.lld.projects.parkingLot.enums.ParkingSlotType;
import com.vishwas.lld.projects.parkingLot.enums.ParkingSpaceStatus;

import java.util.Map;

public abstract class ParkingSlot {
    private String parkingSlotId;
    private ParkingSpaceStatus parkingSpaceStatus;
    private ParkingSlotType parkingSlotType;
    public ParkingSlot(ParkingSlotType parkingSlotType) {
        parkingSlotId += 1;
        this.parkingSpaceStatus = ParkingSpaceStatus.AVAILABLE;
        this.parkingSlotType = parkingSlotType;
    }
    public abstract boolean canFit(Vehicle vehicle);

    public ParkingSpaceStatus getParkingSpaceStatus() {
        return parkingSpaceStatus;
    }

    public void setParkingSpaceStatus(ParkingSpaceStatus parkingSpaceStatus) {
        this.parkingSpaceStatus = parkingSpaceStatus;
    }

    public ParkingSlotType getParkingSlotType() {
        return parkingSlotType;
    }
}
