package com.vishwas.java.oops.inheritance.upcasting;

// 1. Parent Class: The general blueprint for any payment
class PaymentMethod{
    String method;

    public PaymentMethod(String method) {
        this.method = method;
    }

    // This is the generic behavior
    public void processPayment(double amt){
        System.out.println("Processing payment Rs. "+amt+" using general method.");
    }
}
// 2. Child Class: Visa
class Visa extends PaymentMethod{
    public Visa() {
        super("Visa");
    }

    @Override
    public void processPayment(double amt){
        System.out.println("Processing payment of Rs. "+amt+" using VISA");
    }

    public void cardLimit(){
        System.out.println("Card limit is RS 40000.0");
    }
}

// 3. Child Class: MasterCard
class MasterCard extends PaymentMethod{
    public MasterCard() {
        super("Master Card");
    }

    @Override
    public void processPayment(double amt){
        System.out.println("Processing payment of Rs. "+amt+" using Master Card");
    }
}

// 4. Child Class: UPI
class UPI extends PaymentMethod{
    public UPI() {
        super("UPI");
    }

    @Override
    public void processPayment(double amt){
        System.out.println("Processing payment of Rs. "+amt+" using UPI");
    }
}

//5. Newly added payment method in future "Crypto"
class Crypto extends PaymentMethod{
    public Crypto() {
        super("Crypto");
    }

    @Override
    public void processPayment(double amt){
        System.out.println("Processing payment of Rs. "+amt+" using Crypto");
    }
}