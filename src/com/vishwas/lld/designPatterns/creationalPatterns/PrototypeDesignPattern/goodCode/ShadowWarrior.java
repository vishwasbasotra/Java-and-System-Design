package com.vishwas.lld.designPatterns.creationalPatterns.PrototypeDesignPattern.goodCode;

import java.util.ArrayList;
import java.util.List;

public class ShadowWarrior implements Prototype{
    public String weapon;
    public int health;
    public List<String> abilities;

    public ShadowWarrior(String weapon, int health) {
        this.weapon = weapon;
        this.health = health;
        this.abilities = new ArrayList<>();
    }

    // Constructor for cloning (Deep Copy)
    public ShadowWarrior(ShadowWarrior warrior) {
        this.weapon = warrior.weapon;
        this.health = warrior.health;
        // Ensure we copy the list, not just the reference
        this.abilities = new ArrayList<>(warrior.abilities);
    }

    @Override
    public String toString() {
        return "ShadowWarrior{" +
                "weapon='" + weapon + '\'' +
                ", health=" + health +
                ", abilities=" + abilities +
                '}';
    }

    @Override
    public Prototype clone() {
        // We use the copy constructor to return a new instance
        return new ShadowWarrior(this);
    }
}
