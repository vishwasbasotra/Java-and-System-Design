package com.vishwas.lld.designPatterns.structuralPatterns.AdapterDesignPattern.goodCode;

public class CoffeeMachineAdapter implements SmartDevices{
    private CoffeeMachine coffeeMachine;

    public CoffeeMachineAdapter(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void turnOn() {
        coffeeMachine.connectViaZigbee();
        coffeeMachine.startBrewing();
    }

    @Override
    public void turnOff() {
        coffeeMachine.stopBrewing();
        coffeeMachine.disconnectZigbee();
    }
}
