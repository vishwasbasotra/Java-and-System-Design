package com.vishwas.lld.designPatterns.structuralPatterns.DecoratorDesignPattern.goodCode;

public class VanillaDecorator extends CoffeeDecorator{
    public VanillaDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription(){
        return coffee.getDescription()+" + Vanilla";
    }

    @Override
    public double getCost(){
        return coffee.getCost()+0.75;
    }
}
