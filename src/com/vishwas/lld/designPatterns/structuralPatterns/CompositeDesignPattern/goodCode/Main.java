package com.vishwas.lld.designPatterns.structuralPatterns.CompositeDesignPattern.goodCode;

public class Main {
    public static void main() {
        // Create individual devices
        SmartComponent airConditioner = new AC();
        SmartComponent smartLight = new SmartLight();
        // Create a room and add devices
        CompositeSmartComponent room1 = new CompositeSmartComponent();
        room1.addComponent(airConditioner);
        room1.addComponent(smartLight);
        // Add more rooms for demonstration
        CompositeSmartComponent room2 = new CompositeSmartComponent();
        room2.addComponent(new AC());
        room2.addComponent(new SmartLight());
        // Create a floor and add rooms
        CompositeSmartComponent floor = new CompositeSmartComponent();
        floor.addComponent(room1);
        floor.addComponent(room2);
        // Create the house and add floors
        CompositeSmartComponent house = new CompositeSmartComponent();
        house.addComponent(floor);

        // Control the entire house
        System.out.println("Turning On all the devices in the house:");
        house.turnOn();
        System.out.println("Turning Off all the devices in the house:");
        house.turnOff();

        // Control the entire floor
        System.out.println("Turning On all the devices in the floor:");
        floor.turnOn();
        System.out.println("Turning Off all the devices in the floor:");
        floor.turnOff();

        // Control the entire house
        System.out.println("Turning On all the devices in the room1:");
        room1.turnOn();
        System.out.println("Turning Off all the devices in the room1:");
        room1.turnOff();

        // Control the individual device
        System.out.println("Turning On an individual AC");
        airConditioner.turnOn();
        System.out.println("Turning an individual Smart Light");
        smartLight.turnOn();
    }
}
