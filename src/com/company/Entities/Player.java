package com.company.Entities;

import com.company.Items.IEquipment;
import com.company.Items.Item;

public class Player extends Entity implements IEquipment {

    public Player() {
        super();
    }

    public Player(String name, double lvl, Races race, String role, double hp, double dmg) {
        super(name, lvl, race, role, hp, dmg);
    }

    public Player(String name, double lvl, Races race, String role, double hp, double dmg, Item equippedWeapon, Item equippedArmor) {
        super(name, lvl, race, role, hp, dmg, equippedWeapon, equippedArmor);
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
        return "Player {" + super.toString() + '}';
    }

    public void levelUp(Player player) {
        player.setLvl(player.getLvl() + 1);
    }
}
