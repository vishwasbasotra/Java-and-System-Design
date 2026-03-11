package com.vishwas.lld.designPatterns.structuralPatterns.AdapterDesignPattern.goodCode;

public class SmartLight {
    void connectViaWifi(){
        System.out.println("Smart Light connect via WiFi");
    }
    void switchOn(){
        System.out.println("Smart light switched ON");
    }
    void switchOff(){
        System.out.println("Smart light switched OFF");
    }
    void disconnectWifi(){
        System.out.println("Disconnect smart light");
    }
}
