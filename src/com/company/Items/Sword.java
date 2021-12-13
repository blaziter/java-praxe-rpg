package com.company.Items;

public class Sword extends Item {
    String name;
    double dmg;
    double crit;
    double lifeSteal;
    int cost;

    public Sword(String name, double dmg) {
        this.name = name;
        this.dmg = dmg;
    }

    public Sword(String name, double dmg, double crit) {
        this.name = name;
        this.dmg = dmg;
        this.crit = crit;
    }

    public Sword(String name, double dmg, double crit, double lifeSteal) {
        this.name = name;
        this.dmg = dmg;
        this.crit = crit;
        this.lifeSteal = lifeSteal;
    }

    public Sword(String name, double dmg, double crit, double lifeSteal, int cost) {
        this.name = name;
        this.dmg = dmg;
        this.crit = crit;
        this.lifeSteal = lifeSteal;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDmg() {
        return dmg;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    public double getCrit() {
        return crit;
    }

    public void setCrit(double crit) {
        this.crit = crit;
    }

    public double getLifeSteal() {
        return lifeSteal;
    }

    public void setLifeSteal(double lifeSteal) {
        this.lifeSteal = lifeSteal;
    }

    public int getCost() {
        return cost;
    }
}
