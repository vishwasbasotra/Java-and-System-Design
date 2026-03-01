package com.vishwas.lld.designPrinciples.SOLID.V_DependencyInversionPrinciple.goodCode;

public class EmailNotification implements NotificationService{
    @Override
    public void notify(String msg) {
        System.out.println("Sending Email: "+msg);
    }
}
