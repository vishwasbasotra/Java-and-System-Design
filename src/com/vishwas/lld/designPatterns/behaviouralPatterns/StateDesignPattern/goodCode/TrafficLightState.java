package com.vishwas.lld.designPatterns.behaviouralPatterns.StateDesignPattern.goodCode;

public interface TrafficLightState {
    void next(TrafficLightContext context);
    String getColor();
}
