package com.vishwas.lld.projects.parkingLot.model;

import com.vishwas.lld.projects.parkingLot.enums.ParkingSlotType;
import com.vishwas.lld.projects.parkingLot.enums.ParkingSpaceStatus;

public abstract class ParkingSlot {
    private final String parkingSlotId;   // Unique to THIS instance
    private ParkingSpaceStatus parkingSpaceStatus;
    private final ParkingSlotType parkingSlotType;

    public ParkingSlot(String id, ParkingSlotType parkingSlotType) {
        this.parkingSlotId = id;
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

    public String getParkingSlotId() {
        return parkingSlotId;
    }
}
