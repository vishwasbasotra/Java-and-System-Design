package com.vishwas.lld.designPrinciples.SOLID.I_SingleResonsibilityPrinciple.badCode;

public class BreadBaker {
    public void bakeBread(){
        System.out.println("Baking high-quality bread...");
    }
    public void manageInventory(){
        System.out.println("Managing inventory...");
    }
    public void orderSupplies(){
        System.out.println("Ordering supplies...");
    }
    public void serveCustomers(){
        System.out.println("Serving the customers...");
    }
    public void cleanBakery(){
        System.out.println("Cleaning the bakery...");
    }

    public static void main(String[] args) {
        BreadBaker bb = new BreadBaker();
        bb.bakeBread();
        bb.manageInventory();
        bb.orderSupplies();
        bb.serveCustomers();
        bb.cleanBakery();
    }
}
