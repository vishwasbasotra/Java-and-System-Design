package com.vishwas.lld.projects.parkingLot;

import com.vishwas.lld.projects.parkingLot.PaymentStrategy.HourlyStrategy;
import com.vishwas.lld.projects.parkingLot.enums.VehicleType;
import com.vishwas.lld.projects.parkingLot.model.*;
import com.vishwas.lld.projects.parkingLot.service.EntrancePanel;
import com.vishwas.lld.projects.parkingLot.service.ExitPanel;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // 1. Setup Infrastructure
        ParkingLot lot = ParkingLot.getInstance("DownTown-HQ");

        // Add a floor with 2 Compact and 1 Large parking slots for testing
        ParkingFloor floor1 = new ParkingFloor(1, 2, 1);
        lot.addFloor(floor1);

        // 2. Setup the gates
        EntrancePanel entranceGate = new EntrancePanel("Entry-1",lot);
        ExitPanel exitGate = new ExitPanel("Exit-1", new HourlyStrategy());

        System.out.println("----Initial State----");
        floor1.showDisplayBoard();

        // 3. Simulate Vehicle 1: A Car arrives
        System.out.println("\n---Car is arriving---");
        Vehicle myCar = new Car("PB35-AK8309");
        ParkingTicket ticket1 = entranceGate.createTicket(myCar);

        if(ticket1 != null){
            floor1.showDisplayBoard();
        }
        System.out.println("\n-------------------------------\n");

        // 4. Simulate vehicle 2: Truck arrives
        System.out.println("\n---Truck is arriving---");
        Vehicle myTruck = new Truck("PB35-AK8310");
        ParkingTicket ticket2 = entranceGate.createTicket(myTruck);
        if(ticket2 != null){
            floor1.showDisplayBoard();
        }

        System.out.println("\n-------------------------------\n");

        // 5. Simulate vehicle 3: Bike arrives
        System.out.println("\n---Bike is arriving---");
        Vehicle myBike = new Bike("PB35-AK1415");
        ParkingTicket ticket3 = entranceGate.createTicket(myBike);
        if(ticket3 != null){
            floor1.showDisplayBoard();
        }

        System.out.println("\n-------------------------------\n");

        // 6. Simulate Time Passing & Exit
        // (In a real test, you might mock the entryTime to be 2 hours ago
        System.out.println("\n----Car is exiting----");
        Thread.sleep(1000); //Simulate a small delay
        double fee = exitGate.processExit(ticket1);

        System.out.println("\n----Final State----");
        floor1.showDisplayBoard();
    }
}
