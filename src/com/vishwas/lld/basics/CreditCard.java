package com.vishwas.lld.basics;

public class CreditCard extends Card{
    public CreditCard(String cardNo, String name) {
        super(cardNo, name);
    }

    @Override
    public void pay() {
        System.out.println("Made payment using credit card: "+this.getCardNo());
    }
}
