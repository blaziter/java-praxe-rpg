package com.company.Items;

public abstract class Item {
    /*public static Sword SF = Sword.SERPENTS_FANG;
    public static Sword SR = Sword.STORMRAZOR;
    public static Sword MM = Sword.MURAMANA;
    public static Sword YG = Sword.YOUMUUS_GHOSTBLADE;
    public static Sword WE = Sword.WITS_END;
    public static Sword DD = Sword.DEATHS_DANCE;
    public static Sword BOTRK = Sword.BOTRK;
    public static Sword DUSKBLADE = Sword.DUSKBLADE;
    public static Sword IE = Sword.IE;
    public static Sword BT = Sword.BLOODTHIRSTER;*/

    public enum Type {
        Weapon,
        Armor,
        Potion
    }

    private Type type;
    private String name;
    private double dmg;
    private double crit;
    private double lifeSteal;

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
