package com.vishwas.java.oops.inheritance.upcasting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main(String[] args) {
        // We can treat different objects as the same Parent Type
        System.out.println("--- Simple upcasting ---");
        PaymentMethod myVisa = new Visa();  //upcasting
        PaymentMethod myMasterCard = new MasterCard();  //upcasting
        PaymentMethod myUPI = new UPI();  //upcasting

        myUPI.processPayment(12300);
        myVisa.processPayment(10000);
        myMasterCard.processPayment(8000);

        System.out.println("--- Executed using parent reference child objects directly ---");


        //myVisa.cardLimit();  //compilation error as the object cannot see the VISA specific things

        // Using Polymorphic Array
        System.out.println("\n--- Using Polymorphic Array ---");
        PaymentMethod[] methods = {new Visa(), new MasterCard(), new UPI()};

        for(PaymentMethod p: methods){
            p.processPayment(12300);    // Calls the specific child logic automatically
        }
        System.out.println("--- Transaction Complete using Polymorphic Array ---\n");

        // new payment method  added in future
        System.out.println("Newly added payment method: Crypto");
        PaymentMethod myCrypto = new Crypto();
        myCrypto.processPayment(34000);

        // Using HashMap
        System.out.println("\n--- Using HashMap ---");
        HashMap<PaymentMethod, Double> pMethods = new HashMap<>();
        pMethods.put(new Visa(), 12300.0);
        pMethods.put(new UPI(), 1200.0);
        pMethods.put(new MasterCard(), 34000.0);

        for(Map.Entry<PaymentMethod, Double> entry: pMethods.entrySet()){
            PaymentMethod method = entry.getKey();
            Double amt = entry.getValue();
            method.processPayment(amt);
        }
        System.out.println("--- Transaction Complete using HashMap ---\n");

    }
}
