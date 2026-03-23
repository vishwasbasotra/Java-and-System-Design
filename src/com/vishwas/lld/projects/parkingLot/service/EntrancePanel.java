package com.vishwas.lld.projects.parkingLot.service;

import com.vishwas.lld.projects.parkingLot.model.ParkingLot;
import com.vishwas.lld.projects.parkingLot.model.ParkingSlot;
import com.vishwas.lld.projects.parkingLot.model.ParkingTicket;
import com.vishwas.lld.projects.parkingLot.model.Vehicle;

public class EntrancePanel {
    private final String panelId;

    public EntrancePanel(String panelId, ParkingLot parkingLot) {
        this.panelId = panelId;
    }

    public ParkingTicket createTicket(Vehicle vehicle){
        // 1. Get the single instance of the Parking Lot
        ParkingLot parkingLot = ParkingLot.getInstance("Downtown-HQ");

        // 2. Ask the Lot to find and book a slot (this is thread-safe inside the floor)
        ParkingSlot assignedSlot = parkingLot.findSlotForParking(vehicle);

        if(assignedSlot == null){
            System.out.println("Sorry, the Parking Lot is currently FULL for " + vehicle.getVehicleType());
            return null;
        }else{
            ParkingTicket ticket = new ParkingTicket(vehicle.getVehicleNumber(), assignedSlot);
            System.out.println("Ticket Issued! ID: "+ticket.getTicketId());
            System.out.println("Please park at Slot ID: "+assignedSlot.getParkingSlotId());
            return ticket;
        }

    }
}
