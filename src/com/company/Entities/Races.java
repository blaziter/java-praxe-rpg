package com.company.Entities;

import com.company.Items.Armor;
import com.company.Items.Weapon;

public enum Races {
    HUMAN(
            new String[] {"Jekster", "Leo", "Werloi", "Merher", "Pakma", "Huim", "Laim", "Pterhe"},
            new String[] {"Warrior", "Mage", "Archer", "Assassin"},
            "Human",
            new double[] {500, 350, 300, 300},
            new double[] {36, 15, 15, 36},
            new double[] {20, 100, 50, 50}
    ),
    VOIDBORN(
            new String[] {"Xar'Zex", "Ler'Jow", "Mer'Hyz", "Vel'Maw", "Kog'Xei", "Kha'Ryo", "Per'Xez", "Ler'Mex", "Fol'Xai"},
            new String[] {"Warrior", "Mage", "Archer", "Assassin"},
            "Voidborn",
            new double[] {500, 350, 300, 300},
            new double[] {38, 17, 17, 38},
            new double[] {20, 100, 50, 50}
    ),
    GOLEM(
            new String[] {"Golstrike", "Golemus", "Golcrank", "Barkcramk", "Lerfcrank", "Nullhexor", "Trofus", "Bromus"},
            new String[] {"Warrior", "Mage"},
            "Golem",
            new double[] {500, 350},
            new double[] {38, 17},
            new double[] {20, 100}
    ),
    DEMON(
            new String[] {"Hexfel", "Furcifer", "Helcifer", "Aoexhel", "Gropem", "Freoim", "Oepenhel", "Joxhcifer"},
            new String[] {"Warrior", "Mage", "Assassin"},
            "Demon",
            new double[] {500, 350, 300},
            new double[] {38, 17, 38},
            new double[] {20, 100, 50}
    ),
    YORDLE(
            new String[] {"Borko", "Lompex", "Jawphite", "Freoi", "Joiv", "Staziz", "Kermal", "Korst"},
            new String[] {"Warrior", "Mage", "Archer", "Assassin"},
            "Yordle",
            new double[] {500, 350, 300, 300},
            new double[] {35, 14, 14, 35},
            new double[] {20, 100, 50, 50}
    ),
    WRAITH(
            new String[] {"Owerjfe", "Vaarshajs", "Deruoi", "Gerioem", "Karfeir", "Zierkeif", "Kerefev", "Losadef"},
            new String[] {"Warrior", "Mage", "Archer"},
            "Wraith",
            new double[] {500, 350, 300},
            new double[] {36, 15, 15},
            new double[] {20, 100, 50}
    ),
    TROLL(
            new String[] {"Trondel", "Trundel", "Frondel", "Frundel", "Grondel", "Grundel", "Frondel", "Frundel"},
            new String[] {"Warrior"},
            "Troll",
            new double[] {500},
            new double[] {46},
            new double[] {20}
    ),
    VASTAYA(
            new String[] {"Zeuistey", "Lerefey", "Perxes", "Foerlei", "Aerlei", "Axofero", "Nomberle", "Perferele"},
            new String[] {"Warrior", "Mage", "Archer"},
            "Vastaya",
            new double[] {500, 350, 300},
            new double[] {36, 15, 15},
            new double[] {20, 100, 50}
    );

    private String[] name;
    private String[] role;
    private String race;
    private double[] hp;
    private double[] dmg;
    private double[] mana;
    private Weapon equippedWeapon;
    private Armor equippedArmor;

    Races(String[] name, String[] role, String race, double[] hp, double[] dmg, double[] mana) {
        this.name = name;
        this.role = role;
        this.race = race;
        this.hp = hp;
        this.dmg = dmg;
        this.mana = mana;
    }

    Races(String[] name, String[] role, String race, double[] hp, double[] dmg, double[] mana, Weapon equippedWeapon, Armor equippedArmor) {
        this.name = name;
        this.role = role;
        this.race = race;
        this.hp = hp;
        this.dmg = dmg;
        this.mana = mana;
        this.equippedWeapon = equippedWeapon;
        this.equippedArmor = equippedArmor;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public String[] getRole() {
        return role;
    }

    public void setRole(String[] role) {
        this.role = role;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public double[] getHp() {
        return hp;
    }

    public void setHp(double[] hp) {
        this.hp = hp;
    }

    public double[] getDmg() {
        return dmg;
    }

    public void setDmg(double[] dmg) {
        this.dmg = dmg;
    }

    public double[] getMana() {
        return mana;
    }

    public void setMana(double[] mana) {
        this.mana = mana;
    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public void setEquippedWeapon(Weapon equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    public Armor getEquippedArmor() {
        return equippedArmor;
    }

    public void setEquippedArmor(Armor equippedArmor) {
        this.equippedArmor = equippedArmor;
    }
}
