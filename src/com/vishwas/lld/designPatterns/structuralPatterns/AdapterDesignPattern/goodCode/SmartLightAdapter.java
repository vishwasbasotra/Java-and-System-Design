package com.vishwas.lld.designPatterns.structuralPatterns.AdapterDesignPattern.goodCode;

public class SmartLightAdapter implements SmartDevices{
    private SmartLight light;

    public SmartLightAdapter(SmartLight light) {
        this.light = light;
    }

    @Override
    public void turnOn() {
        light.connectViaWifi();
        light.switchOn();
    }

    @Override
    public void turnOff() {
        light.switchOff();
        light.disconnectWifi();
    }
}
