package com.company.Entities;

import com.company.IFight;
import com.company.Items.Armor;
import com.company.Items.Item;
import com.company.Items.Weapon;

public class Enemy extends Entity implements IFight {

    public Enemy(String name, String role, String race, double hp, double dmg, double mana) {
        super(name, role, race, hp, dmg, mana);
    }

    public Enemy(String name, String role, String race, double hp, double dmg, double mana, Item equippedWeapon, Item equippedArmor) {
        super(name, role, race, hp, dmg, mana, equippedWeapon, equippedArmor);
    }

    @Override
    public void attack() {

    }

    @Override
    public void block() {

    }

    @Override
    public void useItem() {

    }

    @Override
    public void spell() {

    }

    @Override
    public String toString() {
        return "Enemy{" + super.toString() + '}';
    }
}
