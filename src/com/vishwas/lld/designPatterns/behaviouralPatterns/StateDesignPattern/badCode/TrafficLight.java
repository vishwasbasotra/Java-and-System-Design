package com.vishwas.lld.designPatterns.behaviouralPatterns.StateDesignPattern.badCode;

public class TrafficLight {
    private String color;

    public TrafficLight(String color) {
        this.color = color;
        System.out.println("Light changed from YELLOW to RED. Stop!");
    }

    void next(){
        if(this.color.equals("Red")){
            System.out.println("Light changed from RED to GREEN. Cars go!");
            this.color = "Green";
        } else if (this.color.equals("Green")) {
            System.out.println("Light changed from GREEN to YELLOW. Slow down!");
            this.color = "Yellow";
        } else if (this.color.equals("Yellow")) {
            System.out.println("Light changed from YELLOW to RED. Stop!");
            this.color = "Red";
        }
    }
}
