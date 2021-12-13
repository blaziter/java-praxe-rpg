package com.company.Entities;

import com.company.Items.Item;

public class Enemy extends Entity implements IFight {


    public Enemy(String name, double lvl, Races race, String role, double hp, double dmg) {
        super(name, lvl, race, role, hp, dmg);
    }

    public Enemy(String name, double lvl, Races race, String role, double hp, double dmg, Item equippedSword, Item equippedArmor) {
        super(name, lvl, race, role, hp, dmg, equippedSword, equippedArmor);
    }

    @Override
    public void attack() {

    }

    @Override
    public void block() {

    }

    @Override
    public String toString() {
        return "Enemy {" + super.toString() + '}';
    }
}
