package com.vishwas.lld.designPatterns.behaviouralPatterns.StateDesignPattern.goodCode;

public class RedLight implements TrafficLightState{
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Light changed from RED to GREEN. Cars go!");
        context.setState(new GreenLight());
    }

    @Override
    public String getColor() {
        return "RED";
    }
}
