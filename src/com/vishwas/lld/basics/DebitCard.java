package com.vishwas.lld.basics;

public class DebitCard extends Card{
    public DebitCard(String cardNo, String name) {
        super(cardNo, name);
    }

    @Override
    public void pay() {
        System.out.println("Made payment using debit card: "+this.getCardNo());
    }
}
