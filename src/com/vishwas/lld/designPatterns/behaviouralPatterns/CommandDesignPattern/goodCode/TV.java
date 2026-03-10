package com.vishwas.lld.designPatterns.behaviouralPatterns.CommandDesignPattern.goodCode;

public class TV {
    void turnOn(){
        System.out.println("TV is ON");
    }
    void turnOff(){
        System.out.println("TV is OFF");
    }
    void changeChannel(int channel){
        System.out.println("Changing channel to: "+ channel);
    }
    void adjustVolume(int volume){
        System.out.println("Changing volume to: "+ volume);
    }
}
