package com.vishwas.lld.designPatterns.behaviouralPatterns.StrategyDesignPattern.goodCode;

public class CreditCard implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Validating Card... Charging ₹" + amount + " via Credit Card.");
    }
}
