package com.vishwas.lld.designPatterns.structuralPatterns.AdapterDesignPattern.goodCode;

public class Main {
    public static void main(String[] args) {
        SmartDevices acAdapter = new ACAdapter(new AC());
        SmartDevices smartLightAdapter = new SmartLightAdapter(new SmartLight());
        SmartDevices coffeeMachineAdapter = new CoffeeMachineAdapter(new CoffeeMachine());

        acAdapter.turnOn();
        acAdapter.turnOff();

        smartLightAdapter.turnOn();
        smartLightAdapter.turnOff();

        coffeeMachineAdapter.turnOn();
        coffeeMachineAdapter.turnOff();
    }
}
