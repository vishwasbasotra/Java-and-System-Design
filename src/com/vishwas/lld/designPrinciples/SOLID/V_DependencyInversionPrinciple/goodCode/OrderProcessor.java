package com.vishwas.lld.designPrinciples.SOLID.V_DependencyInversionPrinciple.goodCode;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessor {
    private List<NotificationService> services = new ArrayList<>();

    public OrderProcessor(List<NotificationService> services) {
        this.services = services;
    }

    public void processOrder(int OrderID){
        System.out.println("Processing order #"+OrderID);

        // Logic to process order...

        // Notify everyone without knowing who they are!
        String msg = "Order #"+OrderID+" is ready!";
        for(NotificationService service: services){
            service.notify(msg);
        }
    }
}
