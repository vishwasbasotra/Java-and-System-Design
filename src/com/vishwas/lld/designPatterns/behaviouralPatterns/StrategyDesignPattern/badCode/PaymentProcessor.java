package com.vishwas.lld.designPatterns.behaviouralPatterns.StrategyDesignPattern.badCode;

public class PaymentProcessor {
    public void processPayment(String paymentMethod, double amount) throws IllegalArgumentException{
        if(paymentMethod.equals("Credit Card")) System.out.println("Validating Card... Charging ₹" + amount + " via Credit Card.");
        else if (paymentMethod.equals("Debit Card")) System.out.println("Validating Card... Charging ₹" + amount + " via Debit Card.");
        else if (paymentMethod.equals("PayPal")) System.out.println("Validating PayPal account... Charging ₹" + amount + " via PayPal Card.");
        else throw new IllegalArgumentException("Unsupported Payment Method");
    }
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment("Credit Card", 5100);
        processor.processPayment("Debit Card", 6100);;
        processor.processPayment("PayPal", 2100);;
        processor.processPayment("Crypto", 999);;
    }

}
