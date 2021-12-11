package com.company.Game;

import com.company.Entities.Characters;
import com.company.Entities.Enemies;
import com.company.Entities.Enemy;
import com.company.Entities.Races;

public class Room {
    private static int enemyCount = 0;
    private static int i = 0;

    public Room() {
        showEnemies();
    }

    private static void genEnemies() {
        i = 0;
        int level = Game.getDifficulty();
        Races race = Races.values()[(int) Math.floor(Math.random() * 8)];
        String name = race.getName()[(int) Math.floor(Math.random() * 8)];
        int role = (int) Math.floor(Math.random() * (race.getRole().length - 1));
        Enemy enemy = new Enemy(name, level, race, race.getRole()[role], race.getHp()[role], race.getDmg()[role]);
        Enemies.values()[i].setEnemy(enemy);
    }

    public static void showEnemies() {
        enemyCount = 0;
        for (int i = 0; i < Characters.values().length; i++) {
            if (Characters.values()[i].getPlayer() != null) enemyCount++;
        }
        for (i = 0; i < enemyCount; i++) {
            genEnemies();
        }
        System.out.println("List of enemies in a fight:");
        for (int i = 0; i < Enemies.values().length; i++) {
            if (Enemies.values()[i].getEnemy() != null) System.out.println(Enemies.values()[i].getEnemy());
        }
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
