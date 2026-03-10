package com.vishwas.lld.designPatterns.behaviouralPatterns.StateDesignPattern.goodCode;

public class Main {
    public static void main(String[] args) {
        TrafficLightContext trafficLightState = new TrafficLightContext(new RedLight());

        trafficLightState.next();
        trafficLightState.next();
        trafficLightState.next();
        trafficLightState.next();

        trafficLightState.setState(new GreenLight());
        trafficLightState.next();
    }
}
