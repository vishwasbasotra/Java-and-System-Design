package com.vishwas.lld.designPatterns.structuralPatterns.DecoratorDesignPattern.goodCode;

public class Main {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        espresso = new MilkDecorator(espresso);
        espresso = new SugarDecorator(espresso);
        System.out.println(espresso.getDescription());
        System.out.println(espresso.getCost()+"$");

        Coffee cappuccino = new Cappuccino();
        cappuccino = new MilkDecorator(cappuccino);
        cappuccino = new SugarDecorator(cappuccino);
        cappuccino = new VanillaDecorator(cappuccino);
        System.out.println(cappuccino.getDescription());
        System.out.println(cappuccino.getCost()+"$");
    }
}
