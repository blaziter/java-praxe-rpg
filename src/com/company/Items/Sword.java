package com.company.Items;

public class Sword extends Item {
    public Sword(String name, double dmg) {
        super(name, dmg);
    }

    public Sword(String name, double dmg, double crit) {
        super(name, dmg, crit);
    }

    public Sword(String name, double dmg, double crit, double lifeSteal, int cost) {
        super(name, dmg, crit, lifeSteal, cost);
    }

    public Sword(String name, double dmg, double crit, double lifeSteal, int cost, double hp) {
        super(name, dmg, crit, lifeSteal, cost, hp);
    }

    public Sword(String name, double dmg, double crit, double lifeSteal, int cost, double hp, double armor) {
        super(name, dmg, crit, lifeSteal, cost, hp, armor);
    }
}
