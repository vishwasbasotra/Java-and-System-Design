package com.vishwas.lld.projects.parkingLot.PaymentStrategy;

import java.time.LocalDateTime;

public class HourlyStrategy implements ParkingFeeStrategy {
    private final double hourlyRate = 50.0; //50rs per hour

    @Override
    public double calculateFee(LocalDateTime entryTime, LocalDateTime exitTime) {
        long hours = java.time.Duration.between(entryTime, exitTime).toHours();
        return Math.max(1, hours) * hourlyRate;
    }
}
