package com.vishwas.lld.designPatterns.structuralPatterns.AdapterDesignPattern.badCode;

public class SmartHomeController {
    public void controlDevice(String device){
        if(device.equalsIgnoreCase("AC")){
            System.out.println("Connecting to AC via Bluetooth...");
        } else if (device.equalsIgnoreCase("SmartLight")) {
            System.out.println("Connecting to Smart Light via Wifi...");
        } else if (device.equalsIgnoreCase("CoffeeMachine")) {
            System.out.println("Connecting to Coffee Machine via Zigbee...");
        }else System.out.println("Device not supported");
    }
}
