package com.company.Items;

public class Armor extends Item {

    String name;
    double hp;
    double armor;
    int cost;

    public Armor(String name, double hp) {
        this.name = name;
        this.hp = hp;
    }

    public Armor(String name, double hp, int cost) {
        this.name = name;
        this.hp = hp;
        this.cost = cost;
    }

    public Armor(String name, double hp, double armor, int cost) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getArmor() {
        return armor;
    }

    public int getCost() {
        return cost;
    }
}
