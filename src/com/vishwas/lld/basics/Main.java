package com.vishwas.lld.basics;

public class Main {
    static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("VishwasCreditCard", new CreditCard("1234-1234-1234", "Vishwas Basotra"));
        ps.addPaymentMethod("VishwasDebitCard", new DebitCard("4321-4321-4321", "Vishwas Basotra"));
        ps.addPaymentMethod("VishwasUPI", new UPI("9779961791@ybl"));
        ps.addPaymentMethod("VishwasCrypto", new Crypto("Crypto#123"));


        //ps.paymentMethods.forEach((key, value) -> System.out.println(key + " : " + value));

        ps.makePayment("VishwasUPI");
        ps.makePayment("VishwasCreditCard");
        ps.makePayment("VishwasDebitCard");
    }
}
