package com.vishwas.lld.designPatterns.behaviouralPatterns.StrategyDesignPattern.goodCode;

public class DebitCard implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Validating Card... Charging ₹" + amount + " via Debit Card.");
    }
}
