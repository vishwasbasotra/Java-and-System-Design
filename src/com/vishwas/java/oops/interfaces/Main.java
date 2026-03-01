package com.vishwas.java.oops.interfaces;

public class Main {
    static void main(String[] args) {
//        Engine carEngine = new Car();
//        carEngine.start();
//        carEngine.stop();
//        carEngine.acc();
//
//        Media carMedia = new Car();
//        carMedia.start();
//        carMedia.stop();

        NiceCar nc = new NiceCar();
        nc.start();
        nc.stop();
        nc.startMusic();
        nc.stopMusic();

        //ElectricMotor em = new ElectricMotor();
        nc.changeEngine(new ElectricMotor());
        nc.start();
    }
}
