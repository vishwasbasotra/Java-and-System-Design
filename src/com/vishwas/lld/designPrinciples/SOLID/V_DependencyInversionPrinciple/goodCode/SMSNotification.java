package com.vishwas.lld.designPrinciples.SOLID.V_DependencyInversionPrinciple.goodCode;

public class SMSNotification implements NotificationService{
    @Override
    public void notify(String msg) {
        System.out.println("Sending SMS: "+msg);
    }
}
