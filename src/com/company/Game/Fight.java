package com.company.Game;

import com.company.Entities.*;
import com.company.Items.Inventory;
import com.company.Main;

public class Fight {
    private static boolean isRunning = true;

    public static void setup(Characters[] players, Enemies[] enemies) {
        isRunning = true;
        for (int i = 0; i < Characters.values().length; i++) {
            if (Enemies.values()[i] != null) fight(players[i], enemies[i]);
        }
        Characters.restorePlayers();
    }

    private static void fight(Characters player, Enemies enemy) {
        while (isRunning) {
            printEntities(player, enemy);
            round(player, enemy);
        }
    }

    private static void printEntities(Characters player, Enemies enemy) {
        System.out.println(player.getPlayer());
        System.out.println(enemy.getEnemy());
    }

    private static void round(Characters player, Enemies enemy) {
        Main.scan.nextLine();
        System.out.println(player.getPlayer().getName() + "'s turn!\nEnter your action\n0 = attack\n1 = block");
        switch (Main.scan.nextLine()) {
            case "0" -> {
                System.out.println(player.getPlayer().getName() + " attacked");
                double d = Math.random();
                if (d < 0.5) {
                    System.out.println(enemy.getEnemy().getName() + " attacked");
                    enemy.getEnemy().setHp(Math.floor(enemy.getEnemy().getHp() - player.getPlayer().getDmg()));
                    if (isEnemyDead(player, enemy)) {
                        return;
                    }
                    player.getPlayer().setHp(Math.floor(player.getPlayer().getHp() - enemy.getEnemy().getDmg()));
                    if(isPlayerDead(player)) {
                        return;
                    }
                    return;
                }
                System.out.println(enemy.getEnemy().getName() + " is blocking an incoming attack from " + player.getPlayer().getName());
                enemy.getEnemy().setHp(Math.floor(enemy.getEnemy().getHp() - (player.getPlayer().getDmg() / 3)));
                isEnemyDead(player, enemy);
            }
            case "1" -> {
                System.out.println(player.getPlayer().getName() + " is blocking an incoming attack from " + enemy.getEnemy().getName());
                double d = Math.random();
                if (d < 0.5) {
                    System.out.println(enemy.getEnemy().getName() + " has attacked");
                    player.getPlayer().setHp(Math.floor(player.getPlayer().getHp() - (enemy.getEnemy().getDmg() / 3)));
                    if(isPlayerDead(player)) {
                        return;
                    }
                    return;
                }
                System.out.println(enemy.getEnemy().getName() + " is blocking an incoming attack from " + player.getPlayer().getName());
                System.out.println("Nothing has happened.. both of you blocked.");
            }
            default -> {
                System.out.println("Invalid input");
                round(player, enemy);
            }
        }
    }

    private static boolean isPlayerDead(Characters player) {
        if (player.getPlayer().getHp() <= 0) {
            isRunning = false;
            System.out.println("You have been slain.");
            return true;
        }
        return false;
    }

    private static boolean isEnemyDead(Characters player, Enemies enemy) {
        if (enemy.getEnemy().getHp() <= 0) {
            isRunning = false;
            Inventory.golds += 300;
            System.out.println("You have slain an enemy!");
            enemy = null;
            return true;
        }
        return false;
    }
}
