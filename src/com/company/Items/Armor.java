package com.company.Items;

public class Armor extends Item {
    public Armor(String name, double hp) {
        super(name, hp);
    }

    public Armor(String name, double hp, int cost) {
        super(name, hp, cost);
    }

    public Armor(String name, double hp, double armor, int cost) {
        super(name, hp, armor, cost);
    }
}
