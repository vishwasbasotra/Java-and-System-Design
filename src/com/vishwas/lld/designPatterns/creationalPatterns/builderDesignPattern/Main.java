package com.vishwas.lld.designPatterns.creationalPatterns.builderDesignPattern;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car.CarBuilder().setEngine("Turbo Petrol").setColor("Blue").setSunroof(true).setNavigationSystem(true).build();
        System.out.println(car1);


        Car car2 = new Car.CarBuilder().setEngine("Diesel").setColor("Yellow").setSeats(2).setNavigationSystem(true).build();
        System.out.println(car2);
    }
}
