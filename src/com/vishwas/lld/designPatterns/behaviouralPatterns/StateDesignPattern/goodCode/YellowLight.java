package com.vishwas.lld.designPatterns.behaviouralPatterns.StateDesignPattern.goodCode;

public class YellowLight implements TrafficLightState{
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Light changed from YELLOW to RED. Stop!");
        context.setState(new RedLight());
    }

    @Override
    public String getColor() {
        return "YELLOW";
    }
}
