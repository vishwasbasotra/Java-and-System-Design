package com.vishwas.lld.projects.parkingLot.model;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private int floorNumber;
    private List<ParkingSlot> parkingSlots;

    public ParkingFloor(int floorNumber) {
        this.floorNumber = floorNumber;
        parkingSlots = new ArrayList<>();

        // Add slots dynamically
        for (int i = 0; i < 50; i++) {
            parkingSlots.add(new CompactSlot());
        }
        for (int i = 0; i < 50; i++) {
            parkingSlots.add(new LargeSlot());
        }
    }
}
