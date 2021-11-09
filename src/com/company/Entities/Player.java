package com.company.Entities;

import com.company.IFight;
import com.company.Items.Armor;
import com.company.Items.IEquipment;
import com.company.Items.Item;
import com.company.Items.Weapon;

public class Player extends Entity implements IFight, IEquipment {

    public Player(String name, String role, String race, double hp, double dmg, double mana) {
        super(name, role, race, hp, dmg, mana);
    }

    public Player(String name, String role, String race, double hp, double dmg, double mana, Item equippedWeapon, Item equippedArmor) {
        super(name, role, race, hp, dmg, mana, equippedWeapon, equippedArmor);
    }

    @Override
    public void attack() {
        System.out.println("Dealt " + getEquippedWeapon().getDmg());
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
    public void equipWeapon(Item weapon) {
        setEquippedWeapon(weapon);
    }

    @Override
    public void equipArmor(Item armor) {
        setEquippedArmor(armor);
    }

    @Override
    public void unequip() {

    }

    @Override
    public String toString() {
        return "Player{" + super.toString() + '}';
    }
}
