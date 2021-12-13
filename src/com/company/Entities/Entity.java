package com.company.Entities;

import com.company.Items.Item;

public abstract class Entity  {
    private String name;
    private double lvl;
    private String role;
    private Races race;
    private double hp;
    private double dmg;
    private Item equippedSword;
    private Item equippedArmor;

    public Entity(String name, double lvl, Races race, String role, double hp, double dmg) {
        this.name = name;
        this.lvl = lvl;
        this.race = race;
        this.role = role;
        this.hp = Math.floor(hp + (this.lvl * 35.92));
        this.dmg = dmg;
    }

    public Entity(String name, double lvl, Races race, String role, double hp, double dmg, Item equippedSword, Item equippedArmor) {
        this.name = name;
        this.lvl = lvl;
        this.race = race;
        this.role = role;
        this.hp = Math.floor(hp + (this.lvl * 35.92) + equippedArmor.getHp());
        this.dmg = dmg + equippedSword.getDmg();
        this.equippedSword = equippedSword;
        this.equippedArmor = equippedArmor;
    }

    public Entity() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLvl() {
        return lvl;
    }

    public void setLvl(double lvl) {
        this.lvl = lvl;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Races getRace() {
        return race;
    }

    public void setRace(Races race) {
        this.race = race;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getDmg() {
        return dmg;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    public Item getEquippedSword() {
        return equippedSword;
    }

    public void setEquippedSword(Item equippedWeapon) {
        this.equippedSword = equippedWeapon;
    }

    public Item getEquippedArmor() {
        return equippedArmor;
    }

    public void setEquippedArmor(Item equippedArmor) {
        this.equippedArmor = equippedArmor;
    }

    @Override
    public String toString() {
        //needs to be done this way, otherwise it crashes
        if (equippedSword != null) return  "name='" + name + '\'' +
                ", lvl=" + lvl +
                ", race='" + race + '\'' +
                ", role='" + role + '\'' +
                ", hp=" + hp +
                ", dmg=" + dmg +
                ", equippedWeapon=" + equippedSword.getName() +
                ", equippedArmor=" + equippedArmor;

        if (equippedArmor != null) return  "name='" + name + '\'' +
                ", lvl=" + lvl +
                ", race='" + race + '\'' +
                ", role='" + role + '\'' +
                ", hp=" + hp +
                ", dmg=" + dmg +
                ", equippedWeapon=" + equippedSword +
                ", equippedArmor=" + equippedArmor.getName();

        if (equippedArmor != null && equippedSword != null) return  "name='" + name + '\'' +
                ", lvl=" + lvl +
                ", race='" + race + '\'' +
                ", role='" + role + '\'' +
                ", hp=" + hp +
                ", dmg=" + dmg +
                ", equippedWeapon=" + equippedSword.getName() +
                ", equippedArmor=" + equippedArmor.getName();

        return "name='" + name + '\'' +
                ", lvl=" + lvl +
                ", race='" + race + '\'' +
                ", role='" + role + '\'' +
                ", hp=" + hp +
                ", dmg=" + dmg +
                ", equippedWeapon=" + equippedSword +
                ", equippedArmor=" + equippedArmor;
    }
}
