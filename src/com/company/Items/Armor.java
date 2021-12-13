package com.company.Items;

public class Armor extends Item {
    String name;
    double hp;
    double armor;
    int cost;

    public Armor(String name, double hp) {
        super();
        this.name = name;
        this.hp = hp;
    }

    public Armor(String name, double hp, int cost) {
        super();
        this.name = name;
        this.hp = hp;
        this.cost = cost;
    }

    public Armor(String name, double hp, double armor, int cost) {
        super();
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getHp() {
        return hp;
    }

    public double getArmor() {
        return armor;
    }

    public int getCost() {
        return cost;
    }
}
