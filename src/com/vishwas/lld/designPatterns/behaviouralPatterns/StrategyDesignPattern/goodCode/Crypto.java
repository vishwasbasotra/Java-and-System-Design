package com.vishwas.lld.designPatterns.behaviouralPatterns.StrategyDesignPattern.goodCode;

public class Crypto implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Validating Crypto Wallet... Charging ₹" + amount + " via Crypto.");
    }
}
