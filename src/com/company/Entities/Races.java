package com.company.Entities;

import com.company.Items.Armor;
import com.company.Items.Weapon;

public enum Races {
    HUMAN(
            new String[] {"Jekster", "Leo", "Werloi", "Merher", "Pakma", "Huim", "Laim", "Pterhe"},
            new String[] {"Warrior", "Archer", "Assassin"},
            new double[] {500, 300, 300},
            new double[] {36, 15, 36}
    ),
    VOIDBORN(
            new String[] {"Xar'Zex", "Ler'Jow", "Mer'Hyz", "Vel'Maw", "Kog'Xei", "Kha'Ryo", "Per'Xez", "Ler'Mex"},
            new String[] {"Warrior", "Archer", "Assassin"},
            new double[] {500, 300, 300},
            new double[] {38, 17, 38}
    ),
    GOLEM(
            new String[] {"Golstrike", "Golemus", "Golcrank", "Barkcramk", "Lerfcrank", "Nullhexor", "Trofus", "Bromus"},
            new String[] {"Warrior"},
            new double[] {500},
            new double[] {38}
    ),
    DEMON(
            new String[] {"Hexfel", "Furcifer", "Helcifer", "Aoexhel", "Gropem", "Freoim", "Oepenhel", "Joxhcifer"},
            new String[] {"Warrior", "Archer", "Assassin"},
            new double[] {500, 300, 300},
            new double[] {38, 17, 38}
    ),
    YORDLE(
            new String[] {"Borko", "Lompex", "Jawphite", "Freoi", "Joiv", "Staziz", "Kermal", "Korst"},
            new String[] {"Warrior", "Archer", "Assassin"},
            new double[] {500, 300, 300},
            new double[] {35, 14, 35}
    ),
    WRAITH(
            new String[] {"Owerjfe", "Vaarshajs", "Deruoi", "Gerioem", "Karfeir", "Zierkeif", "Kerefev", "Losadef"},
            new String[] {"Warrior", "Archer", "Assassin"},
            new double[] {500, 300},
            new double[] {36, 15}
    ),
    TROLL(
            new String[] {"Trondel", "Trundel", "Frondel", "Frundel", "Grondel", "Grundel", "Frondel", "Frundel"},
            new String[] {"Warrior"},
            new double[] {500},
            new double[] {46}
    ),
    VASTAYA(
            new String[] {"Zeuistey", "Lerefey", "Perxes", "Foerlei", "Aerlei", "Axofero", "Nomberle", "Perferele"},
            new String[] {"Warrior", "Assassin"},
            new double[] {500, 300},
            new double[] {36, 15}
    );

    private String[] name;
    private String[] role;
    private double[] hp;
    private double[] dmg;
    private Weapon equippedWeapon;
    private Armor equippedArmor;

    Races(String[] name, String[] role, double[] hp, double[] dmg) {
        this.name = name;
        this.role = role;
        this.hp = hp;
        this.dmg = dmg;
    }

    Races(String[] name, String[] role, double[] hp, double[] dmg, Weapon equippedWeapon, Armor equippedArmor) {
        this.name = name;
        this.role = role;
        this.hp = hp;
        this.dmg = dmg;
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
