package com.company.Game;

import com.company.Entities.Characters;
import com.company.Entities.Creation;
import com.company.Items.*;
import com.company.utils.TextUtils;

public class Game {

    public static String difficulty;
    public static int dungCount = 0;

    public static void setDifficulty() {
        switch (TextUtils.nextLine().trim().toLowerCase()) {
            case "easy" -> difficulty = "easy";
            case "normal" -> difficulty = "normal";
            case "hard" -> difficulty = "hard";
            default -> {
                TextUtils.invalidInput();
                setDifficulty();
            }
        }
    }

    public static int getDifficulty() {
        switch (difficulty) {
            case "easy" -> {
                if (dungCount < 2) return dungCount;
                return dungCount-1;
            }
            case "medium" -> {
                return dungCount;
            }
            case "hard" -> {
                return dungCount+1;
            }
        }
        return 0;
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
        System.out.println("4 - Exit");
    }

    public static void game() {
        printOptions();
        switch (TextUtils.nextInt()) {
            case 0 -> {
                dungCount++;
				Dungeon.genDung();
                game();
            }
            case 1 -> {
                TextUtils.printPlayers();
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                game();
            }
            case 2 -> {
                Shopkeeper.shopkeeper();
                game();
            }
            case 3 -> {
                Inventory.showOptions();
                game();
            }
            case 4 -> {
                exit();
            }
            default -> {
                TextUtils.invalidInput();
                game();
            }
        }
    }

    public static void exit() {
        TextUtils.magic();
        System.out.println("There's not a saving system!\nAre you sure? y / n");
        switch (TextUtils.nextLine()) {
            case "y", "yes" -> {
                System.exit(0);
            }
            case "n", "no" -> {
                game();
            }
            default -> {
                TextUtils.invalidInput();
                exit();
            }
        }
    }
}
