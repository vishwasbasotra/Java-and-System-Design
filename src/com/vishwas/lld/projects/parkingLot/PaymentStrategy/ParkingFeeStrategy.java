package com.vishwas.lld.projects.parkingLot.PaymentStrategy;

import java.time.LocalDateTime;

public interface ParkingFeeStrategy {
    double calculateFee(LocalDateTime entryTime, LocalDateTime exitTime);
}
