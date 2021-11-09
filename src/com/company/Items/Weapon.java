package com.company.Items;

public class Weapon extends Item {

    String name;
    double dmg;
    double lifeSteal;
    double crit;

    public Weapon() {

    }

    public Weapon(String name, double dmg) {
        this.name = name;
        this.dmg = dmg;
    }

    public Weapon(String name, double dmg, double lifeSteal) {
        this.name = name;
        this.dmg = dmg;
        this.crit = crit;
    }

    public Weapon(String name, double dmg, double lifeSteal, double crit) {
        this.name = name;
        this.dmg = dmg;
        this.crit = crit;
        this.lifeSteal = lifeSteal;
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
}
