package com.vishwas.lld.projects.parkingLot.model;

import com.vishwas.lld.projects.parkingLot.enums.TicketStatus;

import java.time.LocalDateTime;

public class ParkingTicket {
    private final String ticketId;
    private final String vehicleNumber;
    private ParkingSlot slot;
    private final LocalDateTime entryTime;
    private TicketStatus status;

    public ParkingTicket(String vehicleNumber, ParkingSlot slot) {
        // Automatically generate ID and Time
        this.ticketId = "TKT-"+System.currentTimeMillis();
        this.vehicleNumber = vehicleNumber;
        this.status = TicketStatus.ACTIVE;

        this.slot = slot;
        this.entryTime = LocalDateTime.now();
    }

    public void markAsPaid(){
        this.status = TicketStatus.PAID;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }
}
