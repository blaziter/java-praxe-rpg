package com.company;

import com.company.Entities.Enemy;
import com.company.Entities.Player;
import com.company.Entities.Races;
import com.company.Items.Swords;

public class Main {

    public static void main(String[] args) {
        Player p = new Player("uwuziter","Warrior","Troll",100,25,100);
        Enemy negr = new Enemy(Races.HUMAN.getName()[0], Races.HUMAN.getRole()[0], Races.HUMAN.getRace(), Races.HUMAN.getHp()[0], Races.HUMAN.getDmg()[0], Races.HUMAN.getMana()[0]);
        System.out.println(negr);
        p.setEquippedWeapon(Swords.BOTRK.getItem());
        System.out.println(p.getEquippedWeapon().getName());
        p.attack();
    }
}
