package com.vishwas.lld.projects.parkingLot.model;

import com.vishwas.lld.projects.parkingLot.enums.ParkingSlotType;
import com.vishwas.lld.projects.parkingLot.enums.ParkingSpaceStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingFloor {
    private int floorNumber;
    private List<ParkingSlot> parkingSlots;
    private Map<ParkingSlotType, Integer> freeSlotsCount;


    public ParkingFloor(int floorNumber, int compactSlots, int LargeSlots) {
        this.floorNumber = floorNumber;
        this.parkingSlots = new ArrayList<>();
        this.freeSlotsCount = new HashMap<>();
        this.freeSlotsCount.put(ParkingSlotType.COMPACT, 50);
        this.freeSlotsCount.put(ParkingSlotType.LARGE, 50);

        // Add slots dynamically
        for (int i = 0; i < compactSlots; i++) {
            parkingSlots.add(new CompactSlot("F"+floorNumber+"C"+i));
        }
        for (int i = 0; i < LargeSlots; i++) {
            parkingSlots.add(new LargeSlot("F"+floorNumber+"L"+i));
        }
    }

    /**
     * Thread-safe method to find, book, and update the display board simultaneously.
     */
    public synchronized ParkingSlot findAvailableSlot(Vehicle vehicle){
        for(ParkingSlot slot: parkingSlots){
            if(slot.getParkingSpaceStatus() == ParkingSpaceStatus.AVAILABLE && slot.canFit(vehicle)){
                // Book the slot
                slot.setParkingSpaceStatus(ParkingSpaceStatus.OCCUPIED);
                // Update Display Board Data (Decrement)
                ParkingSlotType type = slot.getParkingSlotType();
                freeSlotsCount.put(type, freeSlotsCount.get(type)-1);

                return slot;
            }
        }
        return null;
        }

    /**
     * Thread-safe method to release a slot and update the display board.
     */
    public synchronized void releaseSlot(ParkingSlot slot) {
        if(slot.getParkingSpaceStatus() == ParkingSpaceStatus.OCCUPIED){
            slot.setParkingSpaceStatus(ParkingSpaceStatus.AVAILABLE);

            //Update Display Board Data (Increment)
            ParkingSlotType type = slot.getParkingSlotType();
            freeSlotsCount.put(type, freeSlotsCount.get(type)+1);
        }
    }

    /**
     * Represents the "Display Board" output for this floor.
     * This runs in O(1) because we aren't looping through slots.
     */
    void showDisplayBoard(){
        System.out.println("--Floor "+this.floorNumber+" Availability--");
        for (Map.Entry<ParkingSlotType, Integer> entry: freeSlotsCount.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue()+" free slots.");
        }
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
