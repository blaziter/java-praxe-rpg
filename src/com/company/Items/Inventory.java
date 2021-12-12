package com.company.Items;

import com.company.Main;

import java.util.ArrayList;

public class Inventory {
    public static double golds = 0;
    public static ArrayList<Item> inv = new ArrayList<>();

    public static void showOptions() {
        System.out.println("Here's your inventory, please select what you'd like to do.\n0 = show golds\n1 = show items\n2 = equip items\n3 = unequip items\n4 = exit");
        switch (Main.scan.nextInt()) {
            case 0 -> {
                System.out.println(golds);
                showOptions();
            }
            case 1 -> {
                System.out.println(inv);
                showOptions();
            }
            case 2 -> {
                //equip items
            }
            case 3 -> {
                //unequip items
            }
            case 4 -> {
                return;
            }
            default -> {
                System.out.println("Invalid input");
                showOptions();
            }

        }
    }

}
