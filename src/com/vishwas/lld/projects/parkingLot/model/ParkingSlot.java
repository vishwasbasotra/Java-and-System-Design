package com.vishwas.lld.projects.parkingLot.model;

import com.vishwas.lld.projects.parkingLot.enums.ParkingSlotType;
import com.vishwas.lld.projects.parkingLot.enums.ParkingSpaceStatus;

public abstract class ParkingSlot {
    private String parkingSlotId;
    private ParkingSpaceStatus parkingSpaceStatus;
    private ParkingSlotType parkingSlotType;
    private int row, col;

    public ParkingSlot(String parkingSlotId, ParkingSlotType parkingSlotType, int row, int col) {
        this.parkingSlotId = parkingSlotId;
        this.parkingSpaceStatus = ParkingSpaceStatus.AVAILABLE;
        this.parkingSlotType = parkingSlotType;
        this.row = row;
        this.col = col;
    }
    public abstract boolean canFit(Vehicle vehicle);
}
