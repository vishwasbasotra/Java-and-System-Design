package com.vishwas.lld.basics;

abstract public class Card implements PaymentMethod {
    private String cardNo;
    private String name;
    public Card(String cardNo, String name) {
        this.cardNo = cardNo;
        this.name = name;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getName() {
        return name;
    }
}
