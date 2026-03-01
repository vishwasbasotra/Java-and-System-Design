package com.vishwas.lld.basics;

public class Crypto implements PaymentMethod {
    String cryptoWallet;

    public Crypto(String cryptoWallet) {
        this.cryptoWallet = cryptoWallet;
    }

    public String getCryptoWallet() {
        return cryptoWallet;
    }

    @Override
    public void pay() {
        System.out.println("Made payment using Crypto Wallet: "+this.cryptoWallet);
    }
}
