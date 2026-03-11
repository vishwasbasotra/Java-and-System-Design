package com.vishwas.lld.designPatterns.structuralPatterns.AdapterDesignPattern.goodCode;

public class AC {
    void connectViaBluetooth(){
        System.out.println("AC connecting via Bluetooth");
    }
    void startCooling(){
        System.out.println("AC starts cooling");
    }
    void stopCooling(){
        System.out.println("AC stops cooling");
    }
    void disconnectBluetooth(){
        System.out.println("AC disconnecting");
    }
}
