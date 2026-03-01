package com.vishwas.java.oops.interfaces;

public class ElectricMotor implements Engine{
    @Override
    public void start() {
        System.out.println("Motor starts");
    }

    @Override
    public void stop() {
        System.out.println("Motor stops");
    }

    @Override
    public void acc() {
        System.out.println("Motor's accelerating");
    }
}
