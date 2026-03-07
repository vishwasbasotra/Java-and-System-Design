package com.vishwas.lld.designPatterns.behaviouralPatterns.StrategyDesignPattern.goodCode;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        DebitCard debitCard = new DebitCard();
        PayPal paypal = new PayPal();
        Crypto crypto = new Crypto();

        PaymentMethod method = new PaymentMethod(creditCard);
        method.processPayment(5100);

        method.setStrategy(debitCard);
        method.processPayment(2100);

        method.setStrategy(paypal);
        method.processPayment(1100);

        method.setStrategy(crypto);
        method.processPayment(501);
    }
}
