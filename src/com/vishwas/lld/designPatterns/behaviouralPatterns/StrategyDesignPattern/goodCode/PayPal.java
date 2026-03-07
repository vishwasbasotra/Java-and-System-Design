package com.vishwas.lld.designPatterns.behaviouralPatterns.StrategyDesignPattern.goodCode;

public class PayPal implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Validating PayPal account... Charging ₹" + amount + " via PayPal.");

    }
}
