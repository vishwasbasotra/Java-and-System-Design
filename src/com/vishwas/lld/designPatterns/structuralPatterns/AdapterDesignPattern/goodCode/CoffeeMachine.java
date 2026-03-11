package com.vishwas.lld.designPatterns.structuralPatterns.AdapterDesignPattern.goodCode;

public class CoffeeMachine {
    void connectViaZigbee(){
        System.out.println("Connecting coffee machine via Zigbee");
    }

    void startBrewing(){
        System.out.println("Coffee machine started brewing");
    }

    void stopBrewing(){
        System.out.println("Coffee machine stopped brewing");
    }
    void disconnectZigbee(){
        System.out.println("Disconnect Coffee Machine");
    }
}
