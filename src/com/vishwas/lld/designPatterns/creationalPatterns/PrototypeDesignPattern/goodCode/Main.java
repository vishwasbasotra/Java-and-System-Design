package com.vishwas.lld.designPatterns.creationalPatterns.PrototypeDesignPattern.goodCode;

public class Main {
    public static void main(String[] args) {
        ShadowWarrior prototype = new ShadowWarrior("Katana", 100);
        prototype.abilities.add("Prone");
        prototype.abilities.add("Sprint");

        ShadowWarrior warrior1 = (ShadowWarrior) prototype.clone();
        warrior1.weapon = "Long Sword";
        warrior1.abilities.add("Double Jump");
        warrior1.abilities.add("Breach");

        ShadowWarrior warrior2 = (ShadowWarrior) prototype.clone();
        warrior2.abilities.add("Scan");
        warrior2.abilities.add("Stun");

        System.out.println(warrior1.toString());
        System.out.println(warrior2.toString());
    }
}
