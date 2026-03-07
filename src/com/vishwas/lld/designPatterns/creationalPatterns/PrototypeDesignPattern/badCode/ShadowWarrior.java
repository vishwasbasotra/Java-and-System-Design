package com.vishwas.lld.designPatterns.creationalPatterns.PrototypeDesignPattern.badCode;

import java.util.ArrayList;
import java.util.List;

public class ShadowWarrior {
    public String weapon;
    public int health;
    public List<String> abilities;

    public ShadowWarrior(String weapon, int health) {
        this.weapon = weapon;
        this.health = health;
        this.abilities = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "ShadowWarrior{" +
                "weapon='" + weapon + '\'' +
                ", health=" + health +
                ", abilities=" + abilities +
                '}';
    }
}
