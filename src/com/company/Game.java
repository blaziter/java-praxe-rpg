package com.company;

import com.company.Entities.Characters;
import com.company.Entities.Creation;
import com.company.Items.Armors;
import com.company.Items.Swords;

import java.util.Arrays;

public class Game {

    public static String difficulty;

    public static void setDifficulty() {
        switch (Main.scan.nextLine().trim().toLowerCase()) {
            case "easy" -> difficulty = "easy";
            case "normal" -> difficulty = "normal";
            case "hard" -> difficulty = "hard";
            default -> {
                System.out.println("Invalid input");
                setDifficulty();
            }
        }
    }

    public static void start() {
        System.out.println("Welcome to D&D inspired by League of Legends from Riot Games");
        System.out.println("Please enter difficulty\nAvailable:\nEasy Normal Hard");
        setDifficulty();
        System.out.println("Please create your first character");
        Creation.create();
        game();
    }

    public static void printOptions() {
        System.out.println("What would you like to do?");
        System.out.println("0 - Enter a dungeon");
        System.out.println("1 - Show character statuses");
        System.out.println("2 - Enter a shop");
        System.out.println("3 - Manage inventory");
        System.out.println("4 - Save game");
        System.out.println("5 - Load game");
        System.out.println("6 - Exit");
    }

    public static void game() {
        printOptions();
        switch (Main.scan.nextInt()) {
            case 0 -> {
				/*3 - 8 easy
				5 - 12 medium
				10 - 17 hard
                random dungeon length last number = boss*/
                game();
            }
            case 1 -> {
                for (int i = 0; i < Characters.values().length; i++) {
                    if (Characters.values()[i].getPlayer() != null) System.out.println(Characters.values()[i].getPlayer());
                }
                game();
            }
            case 2 -> {
                shopkeeper();
                game();
            }
            case 3 -> {
                game();
            }
            case 6 -> {
                exit();
            }
            default -> {
                System.out.println("Invalid choice");
                game();
            }
        }
    }

    public static void shopkeeper() {
        System.out.println("Welcome to a shop!\nWhat would you like to do?");
        System.out.println("0 - Buy an item\n1 - Sell an item\n2 - Exit");
        switch (Main.scan.nextInt()) {
            case 0 -> {
                buy();
                shopkeeper();
            }
            case 1 -> {
                sell();
                shopkeeper();
            }
            case 2 -> {
                return;
            }
            default -> {
                System.out.println("Invalid choice");
                shopkeeper();
            }
        }
    }

    public static void buy() {
        System.out.println("What would you like to buy?\n0 - Buy a weapon\n1 - Buy an armor\n2 - Buy a new player\n3 - Exit buy menu");
        switch (Main.scan.nextInt()) {
            case 0 -> {
                System.out.println(Arrays.toString(Swords.values()));
            }
            case 1 -> {
                System.out.println(Arrays.toString(Armors.values()));
            }
            case 2 -> {
                Creation.create();
            }
            case 3 -> {
                return;
            }
            default -> {
                System.out.println("Invalid choice");
                sell();
            }
        }
    }

    public static void sell() {
        System.out.println("What would you like to sell?\n0 - Sell an item\n1 - Sell a player\n2 - Exit sell menu");
        switch (Main.scan.nextInt()) {
            case 0 -> {

            }
            case 1 -> {
                Creation.delete();
            }
            case 2 -> {
                return;
            }
            default -> {
                System.out.println("Invalid choice");
                sell();
            }
        }
    }

    public static void exit() {
        System.out.println("Are you sure? y / n");
        switch (Main.scan.nextLine()) {
            case "y", "yes" -> {
                return;
            }
            case "n", "no" -> {
                game();
            }
            default -> {
                System.out.println("Invalid choice");
                exit();
            }
        }
    }
}
