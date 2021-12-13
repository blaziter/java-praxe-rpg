package com.company.utils;

import com.company.Entities.Characters;
import com.company.Entities.Enemy;
import com.company.Items.*;
import jaco.mp3.player.MP3Player;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class TextUtils {
    private static Scanner scan = new Scanner(System.in);

    public static int nextInt() {
        return scan.nextInt();
    }

    public static String nextLine() {
        return scan.nextLine();
    }

    public static String magic() {
        return scan.nextLine();
    }

    public static void shopkeeperMenu() {
        System.out.println("Welcome to a shop!\nWhat would you like to do?");
        System.out.println("0 - Buy an item\n1 - Sell an item\n2 - Exit");
    }

    public static void invalidInput() {
        System.out.println("Invalid input");
    }

    public static void shopkeeperBuySword() {
        showCurrency();
        System.out.println(Arrays.toString(StarterItems.values()));
        for (StarterItems item : StarterItems.values()) {
            System.out.print(item.getItem().getName() + ", cost: " + item.getItem().getCost());
            System.out.println();
        }
        System.out.println(Arrays.toString(Swords.values()));
        for (Swords sword : Swords.values()) {
            System.out.print(sword.getItem().getName() + ", cost: " + sword.getItem().getCost());
            System.out.println();
        }
        System.out.println("Please enter a weapon as a shortcut as shown inside brackets [].\nEx. DB or SF etc.");
        magic();
    }

    public static void shopkeeperBuyArmor() {
        showCurrency();
        System.out.println(Arrays.toString(Armors.values()));
        for (Armors armor : Armors.values()) {
            System.out.print(armor.getItem().getName() + ", cost: " + armor.getItem().getCost());
            System.out.println();
        }
        System.out.println("Please enter an armor as a shortcut as shown inside brackets [].\nEx. WA or SA etc.");
        magic();
    }

    public static void showCurrency() {
        System.out.println("Current currency: " + Inventory.golds);
    }

    public static void shopkeeperSellItem() {
        System.out.println(Arrays.toString(StarterItems.values()) + " " + Arrays.toString(Swords.values()) + " " + Arrays.toString(Armors.values()));
        System.out.println("Please enter an item as a shortcut as shown inside brackets [].\nEx. DB, SF, WA or SA etc.");
        magic();
    }

    public static void checkMalphite(Enemy boss) {
        if (boss.getName().equals("Malphite")) {
            MP3Player malphite = new MP3Player();
            malphite.addToPlayList(new File("src/com/company/Sounds/Malphite_Ban.mp3"));
            malphite.addToPlayList(new File("src/com/company/Sounds/Malphite_Select.mp3"));
            malphite.play();
            System.out.println("You will lose!\nRock solid!");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void showSwords() {
        System.out.println(Arrays.toString(StarterItems.values()));
        System.out.println(Arrays.toString(BasicItems.values()) + " (CA does not count)");
        System.out.println(Arrays.toString(Swords.values()));
    }

    public static void showArmors() {
        System.out.println(Arrays.toString(BasicItems.values()) + " (Other items than CA do not count)");
        System.out.println(Arrays.toString(Armors.values()));
    }

    public static void printPlayers() {
        for (int i = 0; i < Characters.values().length; i++) {
            if (Characters.values()[i].getPlayer() != null) System.out.println(Characters.values()[i]+ " " +Characters.values()[i].getPlayer());
        }
    }

    public static void equipMenu() {
        System.out.println("Select which character will equip an item.\nChoose from 0 to 4");
    }

    public static void equipOption() {
        System.out.println("0 - Equip a sword\n1 - Equip an armor");
    }

    public static void unequipMenu() {
        System.out.println("Select which character will unequip an item.\nChoose from 0 to 4");
    }

    public static void unequipOption() {
        System.out.println("0 - Unequip a sword\n1 - Unequip an armor");
    }
}
