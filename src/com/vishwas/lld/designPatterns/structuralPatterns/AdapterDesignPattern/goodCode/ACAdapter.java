package com.vishwas.lld.designPatterns.structuralPatterns.AdapterDesignPattern.goodCode;

public class ACAdapter implements SmartDevices{
    private AC ac;

    public ACAdapter(AC ac) {
        this.ac = ac;
    }

    @Override
    public void turnOn() {
        ac.connectViaBluetooth();
        ac.startCooling();
    }

    @Override
    public void turnOff() {
        ac.stopCooling();
        ac.disconnectBluetooth();
    }
}
