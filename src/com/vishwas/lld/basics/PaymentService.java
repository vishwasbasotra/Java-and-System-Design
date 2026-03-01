package com.vishwas.lld.basics;

import java.util.HashMap;

public class PaymentService {
    //Storing + Making Payments
    HashMap<String, PaymentMethod> paymentMethods = new HashMap<>();

    public PaymentService() {
        this.paymentMethods = new HashMap<>();
    }

    public void addPaymentMethod(String name, PaymentMethod pm){
        this.paymentMethods.put(name, pm);
    }

    public HashMap<String, PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public void makePayment(String name){
        PaymentMethod pm = this.paymentMethods.get(name);
        pm.pay();   // run time polymorphism
    }
}
