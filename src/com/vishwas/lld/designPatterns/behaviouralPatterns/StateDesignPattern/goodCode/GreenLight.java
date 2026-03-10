package com.vishwas.lld.designPatterns.behaviouralPatterns.StateDesignPattern.goodCode;

public class GreenLight implements TrafficLightState{
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Light changed from GREEN to YELLOW. Wait!");
        context.setState(new YellowLight());
    }

    @Override
    public String getColor() {
        return "GREEN";
    }
}
