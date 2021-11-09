package com.company.Entities;

import com.company.Items.Armor;
import com.company.Items.Item;
import com.company.Items.Weapon;

public abstract class Entity  {
    private String name;
    private String role;
    private String race;
    private double hp;
    private double dmg;
    private double mana;
    private Item equippedWeapon;
    private Item equippedArmor;

    public Entity(String name, String role, String race, double hp, double dmg, double mana) {
        this.name = name;
        this.role = role;
        this.race = race;
        this.hp = hp;
        this.dmg = dmg;
        this.mana = mana;
    }

    public Entity(String name, String role, String race, double hp, double dmg, double mana, Item equippedWeapon, Item equippedArmor) {
        this.name = name;
        this.role = role;
        this.race = race;
        this.hp = hp;
        this.dmg = dmg;
        this.mana = mana;
        this.equippedWeapon = equippedWeapon;
        this.equippedArmor = equippedArmor;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
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

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public Item getEquippedWeapon() {
        return equippedWeapon;
    }

    public void setEquippedWeapon(Item equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    public Item getEquippedArmor() {
        return equippedArmor;
    }

    public void setEquippedArmor(Item equippedArmor) {
        this.equippedArmor = equippedArmor;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", race='" + race + '\'' +
                ", hp=" + hp +
                ", dmg=" + dmg +
                ", mana=" + mana +
                ", equippedWeapon=" + equippedWeapon +
                ", equippedArmor=" + equippedArmor;
    }
}
