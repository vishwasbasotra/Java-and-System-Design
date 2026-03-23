package com.vishwas.lld.projects.parkingLot.service;

import com.vishwas.lld.projects.parkingLot.PaymentStrategy.ParkingFeeStrategy;
import com.vishwas.lld.projects.parkingLot.model.ParkingLot;
import com.vishwas.lld.projects.parkingLot.model.ParkingSlot;
import com.vishwas.lld.projects.parkingLot.model.ParkingTicket;

import java.time.LocalDateTime;

public class ExitPanel {
    private String panelId;
    private ParkingFeeStrategy strategy;

    public ExitPanel(String panelId, ParkingFeeStrategy strategy) {
        this.panelId = panelId;
        this.strategy = strategy;
    }

    public ExitPanel(String panelId) {
        this.panelId = panelId;
    }

    public double processExit(ParkingTicket ticket){
        // 1. Calculate Fee
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime exitTime = java.time.LocalDateTime.now();
        double amount = strategy.calculateFee(entryTime, exitTime);

        // 2. Mark Ticket as Paid
        ticket.markAsPaid();

        // 3. Release the Slot (Crucial for the Display Board!)
        ParkingSlot slot = ticket.getSlot();

        // Assuming we add a method to ParkingLot to handle this globally
        ParkingLot.getInstance("Downtown-HQ").releaseSlot(slot);

        System.out.println("Exit process for Ticket: "+ticket.getTicketId());
        System.out.println("Total fee to pay: "+amount);

        return amount;
    }
}
