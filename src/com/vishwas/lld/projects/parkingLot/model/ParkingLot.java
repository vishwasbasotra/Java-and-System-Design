package com.vishwas.lld.projects.parkingLot.model;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot implements Cloneable, Serializable {
    private String name;

    // Static instance for Singleton
    private static ParkingLot instance = null;
    private List<ParkingFloor> parkingfloors;

    private ParkingLot(String name) {
        if(instance != null){
            throw new IllegalArgumentException("Create object using the setter method");
        }else {
            this.name = name;
            this.parkingfloors = new ArrayList<>();
        }
    }

    // Thread-safe Singleton with Double-Checked Locking
    public synchronized static ParkingLot getInstance(String name) {
        if(instance == null){
                instance = new ParkingLot(name);
        }
        return instance;
    }

    @Serial
    public Object readResolve(){
        return instance;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return instance;
    }

    void addFloor(ParkingFloor floor){
        parkingfloors.add(floor);
    }

    /**
     * This is the "Master Search". If Floor 1 is full,
     * it automatically checks Floor 2, and so on.
     */
    public ParkingSlot findSlotForParking(Vehicle vehicle){
        for(ParkingFloor floor: parkingfloors){
            return floor.findAvailableSlot(vehicle);
        }
        return null;
    }

    public List<ParkingFloor> getParkingfloors() {
        return parkingfloors;
    }
}
