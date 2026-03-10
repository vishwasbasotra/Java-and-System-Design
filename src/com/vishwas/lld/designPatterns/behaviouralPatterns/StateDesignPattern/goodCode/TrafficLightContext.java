package com.vishwas.lld.designPatterns.behaviouralPatterns.StateDesignPattern.goodCode;

public class TrafficLightContext {
    private TrafficLightState currentState;

    public TrafficLightContext(TrafficLightState state) {
        this.currentState = state;
    }

    public void setState(TrafficLightState state){
        this.currentState = state;
    }

    public void next(){
        this.currentState.next(this);
    }

    public String getColor(){
        return this.currentState.getColor();
    }
}
