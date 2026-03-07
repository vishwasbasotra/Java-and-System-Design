package com.vishwas.lld.designPatterns.creationalPatterns.PrototypeDesignPattern.badCode;

public class Main {
    public static void main(String[] args) {
        ShadowWarrior warrior1 = new ShadowWarrior("Hammer", 100);
        warrior1.abilities.add("Fly");
        warrior1.abilities.add("Sprint");

        ShadowWarrior warrior2 = new ShadowWarrior("Shotgun", 100);
        warrior2.abilities.add("Double Jump");
        warrior2.abilities.add("Prone");

        System.out.println(warrior1.toString());
        System.out.println(warrior2.toString());

    }
}
