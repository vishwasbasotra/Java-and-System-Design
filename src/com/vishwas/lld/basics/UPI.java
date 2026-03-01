package com.vishwas.lld.basics;

public class UPI implements PaymentMethod {
    String upiID;

    public UPI(String upiID) {
        this.upiID = upiID;
    }

    public String getUpiID() {
        return upiID;
    }

    @Override
    public void pay() {
        System.out.println("Made payment using UPI: "+this.upiID);
    }
}
