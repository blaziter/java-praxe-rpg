package com.company.Game;

import com.company.Entities.Creation;
import com.company.Items.*;
import com.company.utils.TextUtils;

import java.util.Arrays;

import static com.company.Items.Inventory.golds;

public class Shopkeeper {
    public static void shopkeeper() {
        TextUtils.shopkeeperMenu();
        switch (TextUtils.nextInt()) {
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
                TextUtils.invalidInput();
                shopkeeper();
            }
        }
    }

    public static void buy() {
        System.out.println("What would you like to buy?\n0 - Buy a weapon\n1 - Buy an armor\n2 - Buy a new player\n3 - Exit buy menu");
        switch (TextUtils.nextInt()) {
            case 0 -> {
                TextUtils.shopkeeperBuySword();
                String buyItem = TextUtils.nextLine().toUpperCase();
                switch (buyItem) {
                    case "BFS", "CA", "LS", "PA" -> {
                        Item item = StarterItems.valueOf(buyItem).getItem();
                        if (golds >= item.getCost()) {
                            golds -= item.getCost();
                            Inventory.inv.add(item);
                            System.out.println("Successfully bought " + item.getName());
                        }
                    }
                    case "SF", "SR", "MM", "YG", "WE", "DD", "BOTRK", "DB", "IE", "BT" -> {
                        Item item = Swords.valueOf(buyItem).getItem();
                        if (golds >= item.getCost()) {
                            golds -= item.getCost();
                            Inventory.inv.add(item);
                            System.out.println("Successfully bought " + item.getName());
                        }
                    }
                    default -> {
                        TextUtils.invalidInput();
                        buy();
                    }
                }
            }
            case 1 -> {
                TextUtils.shopkeeperBuyArmor();
                String buyItem = TextUtils.nextLine().toUpperCase();
                switch (buyItem) {
                    case "RO", "SV", "DP", "FN", "WA", "FG", "TC", "SA" -> {
                        Item item = Armors.valueOf(buyItem).getItem();
                        if (golds >= item.getCost()) {
                            golds -= item.getCost();
                            Inventory.inv.add(item);
                            System.out.println("Successfully bought " + item.getName());
                        }
                    }
                    default -> {
                        System.out.println("Invalid input");
                        buy();
                    }
                }
            }
            case 2 -> {
                if (golds >= 5000) {
                    Creation.create();
                }
                else System.out.println("Needed 5000 golds.\nInsufficient amount of golds");
            }
            case 3 -> {
                return;
            }
            default -> {
                TextUtils.invalidInput();
                sell();
            }
        }
    }

    public static void sell() {
        System.out.println("What would you like to sell?\n0 - Sell an item\n1 - sell menu");
        switch (TextUtils.nextInt()) {
            case 0 -> {
                TextUtils.shopkeeperSellItem();
                String sellItem = TextUtils.nextLine().toUpperCase();
                switch (sellItem) {
                    case "BFS", "CA", "LS", "PA" -> {
                        if (Inventory.inv.contains(StarterItems.valueOf(sellItem).getItem())) {
                            Inventory.inv.remove(StarterItems.valueOf(sellItem).getItem());
                            golds += (StarterItems.valueOf(sellItem).getItem().getCost() / 100) * 40;
                        }
                        else {
                            TextUtils.invalidInput();
                            sell();
                        }
                    }
                    case "SF", "SR", "MM", "YG", "WE", "DD", "BOTRK", "DB", "IE", "BT" -> {
                        if (Inventory.inv.contains(Swords.valueOf(sellItem).getItem())) {
                            Inventory.inv.remove(Swords.valueOf(sellItem).getItem());
                            golds += (Swords.valueOf(sellItem).getItem().getCost() / 100) * 70;
                        }
                        else {
                            TextUtils.invalidInput();
                            sell();
                        }
                    }
                    case "RO", "SV", "DP", "FN", "WA", "FG", "TC", "SA" -> {
                        if (Inventory.inv.contains(Armors.valueOf(sellItem).getItem())) {
                            Inventory.inv.remove(Armors.valueOf(sellItem).getItem());
                            golds += (Armors.valueOf(sellItem).getItem().getCost() / 100) * 70;
                        }
                        else {
                            TextUtils.invalidInput();
                            sell();
                        }
                    }
                    default -> {
                        TextUtils.invalidInput();
                        sell();
                    }
                }
            }
            case 1 -> {
                return;
            }
            default -> {
                TextUtils.invalidInput();
                sell();
            }
        }
    }
}
