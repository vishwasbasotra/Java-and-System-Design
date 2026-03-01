package com.vishwas.lld.designPrinciples.SOLID.I_SingleResonsibilityPrinciple.goodCode;

public class Main {
    public static void main(String[] args) {
        BreadBaker baker = new BreadBaker();
        ManageInventory inventoryManager = new ManageInventory();
        BakerySupplies supplies = new BakerySupplies();
        CustomerService customerService = new CustomerService();
        BakeryCleaner cleaner = new BakeryCleaner();

        baker.bakeBread();
        inventoryManager.manageInventory();
        supplies.orderSupplies();
        customerService.serveCustomers();
        cleaner.cleanBakery();
    }
}
