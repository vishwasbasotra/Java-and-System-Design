package com.vishwas.lld.designPatterns.behaviouralPatterns.StateDesignPattern.badCode;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("Red");

        trafficLight.next();
        trafficLight.next();
        trafficLight.next();
        trafficLight.next();
    }
}
