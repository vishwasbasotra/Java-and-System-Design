package com.vishwas.lld.designPatterns.structuralPatterns.CompositeDesignPattern.goodCode;

import java.util.ArrayList;
import java.util.List;

public class CompositeSmartComponent implements SmartComponent{
    private List<SmartComponent> components= new ArrayList<>();

    public void addComponent(SmartComponent component) {
        this.components.add(component);
    }

    public void removeComponent(SmartComponent component) {
        this.components.remove(component);
    }

    @Override
    public void turnOn() {
        for(SmartComponent component: components){
            component.turnOn();
        }
    }

    @Override
    public void turnOff() {
        for(SmartComponent component: components){
            component.turnOff();
        }
    }
}
