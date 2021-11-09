package com.company.Items;


public class Sword extends Item{
    /*SERPENTS_FANG("Serpent's Fang" , 61),
    STORMRAZOR("Stormrazor", 67, 0, 0.2),
    MURAMANA("Muramana", 65),
    YOUMUUS_GHOSTBLADE("Youmuu's Ghostblade", 64),
    WITS_END("Wit's End", 56),
    DEATHS_DANCE("Death's Dance", 55),
    BOTRK("Blade of the Ruined King", 83, 0.1),
    DUSKBLADE("Duskblade of Drakktar", 69),
    IE("Infinity Edge", 70, 0, 0.2),
    BLOODTHIRSTER("Bloodthirster", 80, 0.2);*/

    String name;
    double dmg;
    double crit;
    double lifeSteal;

    Sword (String name, double dmg) {
        this.name = name;
        this.dmg = dmg;
    }

    Sword(String name, double dmg, double lifeSteal) {
        this.name = name;
        this.dmg = dmg;
        this.lifeSteal = lifeSteal;
    }

    Sword(String name, double dmg, double lifeSteal, double crit) {
        this.name = name;
        this.dmg = dmg;
        this.lifeSteal = lifeSteal;
        this.crit = crit;
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
