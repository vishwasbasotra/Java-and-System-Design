package com.vishwas.lld.designPrinciples.SOLID.V_DependencyInversionPrinciple.goodCode;

public class InventorySystemAlert implements NotificationService{
    @Override
    public void notify(String msg) {
        System.out.println("Updating Inventory System: "+msg);
    }
}
