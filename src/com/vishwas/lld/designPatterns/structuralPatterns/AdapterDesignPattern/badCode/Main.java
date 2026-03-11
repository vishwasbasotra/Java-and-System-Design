package com.vishwas.lld.designPatterns.structuralPatterns.AdapterDesignPattern.badCode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartHomeController homeController = new SmartHomeController();
        System.out.println("Welcome to a Smart Home Controller");
        System.out.println("Available devices: AC, Smart Light, Coffee Machine");

        while(true){
            System.out.println("Enter device (or type 'exit' to quit) ");
            String device = sc.next();
            if (device.equalsIgnoreCase("exit")) {
                System.out.println("Existing the smart home controller");
                break;
            }
            homeController.controlDevice(device);
        }
    }
}
