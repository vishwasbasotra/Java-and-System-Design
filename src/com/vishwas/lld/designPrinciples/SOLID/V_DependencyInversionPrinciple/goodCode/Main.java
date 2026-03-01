package com.vishwas.lld.designPrinciples.SOLID.V_DependencyInversionPrinciple.goodCode;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // We define what notifications we want for this specific environment
        List<NotificationService> notificationStack = Arrays.asList(new EmailNotification(),
                new SMSNotification(),
                new InventorySystemAlert());

        // Inject the dependencies into the processor
        OrderProcessor processor = new OrderProcessor(notificationStack);
        processor.processOrder(123);
    }
}
