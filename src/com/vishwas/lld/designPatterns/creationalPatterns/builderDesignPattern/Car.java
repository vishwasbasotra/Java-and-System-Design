package com.vishwas.lld.designPatterns.creationalPatterns.builderDesignPattern;

public class Car {
    private String engine;
    private int wheels, seats;
    private String color;
    private boolean sunroof, navigationSystem;

    // Car constructor should be private, ensuring it's only created through the
    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.seats = builder.seats;
        this.color = builder.color;
        this.sunroof = builder.sunroof;
        this.navigationSystem = builder.navigationSystem;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    public boolean isSunroof() {
        return sunroof;
    }

    public boolean isNavigationSystem() {
        return navigationSystem;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", seats=" + seats +
                ", color='" + color + '\'' +
                ", sunroof=" + sunroof +
                ", navigationSystem=" + navigationSystem +
                '}';
    }

    public static class CarBuilder {
        private String engine;
        private int wheels = 4, seats = 5; //default values
        private String color = "black"; //default values
        private boolean sunroof = false, navigationSystem = false; //default values

        public CarBuilder setEngine(String engine){
            this.engine = engine;
            return this;
        }
        public CarBuilder setWheels(int wheels){
            this.wheels = wheels;
            return this;
        }
        public CarBuilder setSeats(int seats){
            this.seats = seats;
            return this;
        }
        public CarBuilder setColor(String color){
            this.color = color;
            return this;
        }
        public CarBuilder setSunroof(boolean sunroof){
            this.sunroof = sunroof;
            return this;
        }
        public CarBuilder setNavigationSystem(boolean navigationSystem){
            this.navigationSystem = navigationSystem;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
