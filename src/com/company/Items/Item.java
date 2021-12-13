package com.company.Items;

public abstract class Item {
    private String name;
    private double dmg;
    private double crit;
    private double lifeSteal;
    private int cost;
    private double hp;
    private double armor;

    public Item(String name, double hp) {
        this.name = name;
        this.hp = hp;
    }

    public Item(String name, double hp, double armor) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
    }

    public Item(String name, double hp, double armor, int cost) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.cost = cost;
    }

    public Item(String name, double dmg, double crit, double lifeSteal, int cost) {
        this.name = name;
        this.dmg = dmg;
        this.crit = crit;
        this.lifeSteal = lifeSteal;
        this.cost = cost;
    }

    public Item(String name, double dmg, double crit, double lifeSteal, int cost, double hp) {
        this.name = name;
        this.dmg = dmg;
        this.crit = crit;
        this.lifeSteal = lifeSteal;
        this.cost = cost;
        this.hp = hp;
    }

    public Item(String name, double dmg, double crit, double lifeSteal, int cost, double hp, double armor) {
        this.name = name;
        this.dmg = dmg;
        this.crit = crit;
        this.lifeSteal = lifeSteal;
        this.cost = cost;
        this.hp = hp;
        this.armor = armor;
    }

    public Item() {

    }


    public String getName() {
        return name;
    }

    public double getDmg() {
        return dmg;
    }

    public double getCrit() {
        return crit;
    }

    public double getLifeSteal() {
        return lifeSteal;
    }

    public double getHp() {
        return hp;
    }

    public double getArmor() {
        return armor;
    }

    public double getCost() {
        return cost;
    }
}
