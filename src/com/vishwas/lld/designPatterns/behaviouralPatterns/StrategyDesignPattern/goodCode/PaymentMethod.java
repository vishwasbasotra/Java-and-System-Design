package com.vishwas.lld.designPatterns.behaviouralPatterns.StrategyDesignPattern.goodCode;

public class PaymentMethod {
    PaymentStrategy strategy;

    public PaymentMethod(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(double amount){
        strategy.processPayment(amount);
    }
}
