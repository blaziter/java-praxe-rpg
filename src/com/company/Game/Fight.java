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

    public static void fight(Player player, Enemy boss) {
        isRunning = true;
        while (isRunning) {
            printEntities(player, boss);
            round(player, boss);
        }
        Characters.restorePlayers();
    }

    private static void printEntities(Characters player, Enemies enemy) {
        System.out.println(player.getPlayer());
        System.out.println(enemy.getEnemy());
    }

    private static void printEntities(Player player, Enemy boss) {
        System.out.println(player);
        System.out.println(boss);
    }

    private static void round(Characters player, Enemies enemy) {
        System.out.println(player.getPlayer().getName() + "'s turn!\nEnter your action\n0 = attack\n1 = block");
        switch (Main.scan.nextLine()) {
            case "0" -> {
                System.out.println(player.getPlayer().getName() + " attacked");
                double d = Math.random();
                if (d < 0.5) {
                    System.out.println(enemy.getEnemy().getName() + " attacked");
                    if (enemy.getEnemy().getEquippedArmor() != null) enemy.getEnemy().setHp(Math.floor(enemy.getEnemy().getHp() + (100 / (100 + enemy.getEnemy().getEquippedArmor().getArmor())) - player.getPlayer().getDmg()));
                    else enemy.getEnemy().setHp(Math.floor(enemy.getEnemy().getHp() - player.getPlayer().getDmg()));
                    if (isEnemyDead(player, enemy)) {
                        return;
                    }
                    if (player.getPlayer().getEquippedArmor() != null) player.getPlayer().setHp(Math.floor(player.getPlayer().getHp() + (100 / (100 + player.getPlayer().getEquippedArmor().getArmor())) - enemy.getEnemy().getDmg()));
                    else player.getPlayer().setHp(Math.floor(player.getPlayer().getHp() - enemy.getEnemy().getDmg()));
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
                    if (player.getPlayer().getEquippedArmor() != null) player.getPlayer().setHp(Math.floor(player.getPlayer().getHp() + (100 / (100 + player.getPlayer().getEquippedArmor().getArmor())) - (enemy.getEnemy().getDmg() / 3)));
                    else player.getPlayer().setHp(Math.floor(player.getPlayer().getHp() - (enemy.getEnemy().getDmg() / 3)));
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

    private static void round(Player player, Enemy boss) {
        System.out.println(player.getName() + "'s turn!\nEnter your action\n0 = attack\n1 = block");
        switch (Main.scan.nextLine()) {
            case "0" -> {
                System.out.println(player.getName() + " attacked");
                double d = Math.random();
                if (d < 0.5) {
                    System.out.println(boss.getName() + " attacked");
                    if (boss.getEquippedArmor() != null) boss.setHp(Math.floor(boss.getHp() + (100 / (100 + boss.getEquippedArmor().getArmor())) - player.getDmg()));
                    else boss.setHp(Math.floor(boss.getHp() - player.getDmg()));
                    if (isEnemyDead(player, boss)) {
                        return;
                    }
                    if (player.getEquippedArmor() != null) player.setHp(Math.floor(player.getHp() + (100 / (100 + player.getEquippedArmor().getArmor())) - boss.getDmg()));
                    else player.setHp(Math.floor(player.getHp() - boss.getDmg()));
                    if(isPlayerDead(player)) {
                        return;
                    }
                    return;
                }
                System.out.println(boss.getName() + " is blocking an incoming attack from " + player.getName());
                boss.setHp(Math.floor(boss.getHp() - (player.getDmg() / 3)));
                isEnemyDead(player, boss);
            }
            case "1" -> {
                System.out.println(player.getName() + " is blocking an incoming attack from " + boss.getName());
                double d = Math.random();
                if (d < 0.5) {
                    System.out.println(boss.getName() + " has attacked");
                    if (player.getEquippedArmor() != null) player.setHp(Math.floor(player.getHp() + (100 / (100 + player.getEquippedArmor().getArmor())) - (boss.getDmg() / 3)));
                    else player.setHp(Math.floor(player.getHp() - (boss.getDmg() / 3)));
                    if(isPlayerDead(player)) {
                        return;
                    }
                    return;
                }
                System.out.println(boss.getName() + " is blocking an incoming attack from " + player.getName());
                System.out.println("Nothing has happened.. both of you blocked.");
            }
            default -> {
                System.out.println("Invalid input");
                round(player, boss);
            }
        }
    }

    private static boolean isPlayerDead(Characters player) {
        if (player.getPlayer().getHp() <= 0) {
            isRunning = false;
            System.out.println("You have been slain.");
            System.out.println("All of your characters have been revived.");
            return true;
        }
        return false;
    }

    private static boolean isPlayerDead(Player player) {
        if (player.getHp() <= 0) {
            isRunning = false;
            System.out.println("You have been slain.");
            System.out.println(player + " has revived.");
            return true;
        }
        return false;
    }

    private static boolean isEnemyDead(Characters player, Enemies enemy) {
        if (enemy.getEnemy().getHp() <= 0) {
            isRunning = false;
            int bounty = 300;
            player.getPlayer().levelUp(player.getPlayer());
            Inventory.golds += bounty;
            System.out.println("You have slain an enemy! Gained " + bounty + " golds and leveled up!");
            enemy = null;
            return true;
        }
        return false;
    }

    private static boolean isEnemyDead(Player player, Enemy boss) {
        if (boss.getHp() <= 0) {
            isRunning = false;
            int bounty = 1000;
            player.levelUp(player);
            Inventory.golds += bounty;
            System.out.println("You have slain an enemy! Gained " + bounty + " golds and leveled up!");
            boss = null;
            return true;
        }
        return false;
    }
}
