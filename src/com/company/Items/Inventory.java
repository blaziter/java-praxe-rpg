package com.company.Items;

import com.company.Entities.Characters;
import com.company.utils.TextUtils;

import java.util.ArrayList;

public class Inventory {
    public static double golds = 0;
    public static ArrayList<Item> inv = new ArrayList<>();

    public static void showOptions() {
        System.out.println("Here's your inventory, please select what you'd like to do.\n0 = show golds\n1 = show items\n2 = equip items\n3 = unequip items\n4 = exit");
        switch (TextUtils.nextInt()) {
            case 0 -> {
                System.out.println(golds);
                showOptions();
            }
            case 1 -> {
                for (Item item : inv) {
                    System.out.print(item.getName() + " ");
                }
                System.out.println();
                showOptions();
            }
            case 2 -> {
                TextUtils.equipMenu();
                TextUtils.printPlayers();
                int select = TextUtils.nextInt();
                if (Characters.values()[select].getPlayer() != null) switch (select) {
                    case 0, 1, 2, 3, 4 -> {
                        TextUtils.equipOption();
                        switch (TextUtils.nextInt()) {
                            case 0 -> {
                                TextUtils.showSwords();
                                String itemSelect = TextUtils.nextLine();
                                switch (itemSelect) {
                                    case "DSB", "DS" -> {
                                        Item item = StarterItems.valueOf(itemSelect).getItem();
                                        if (inv.contains(item)) {
                                            Characters.values()[select].getPlayer().setEquippedSword(item);
                                            inv.remove(item);
                                        }
                                        else {
                                            TextUtils.invalidInput();
                                            showOptions();
                                        }
                                    }
                                    case "BFS", "LS", "PA" -> {
                                        Item item = BasicItems.valueOf(itemSelect).getItem();
                                        if (inv.contains(item)) {
                                            Characters.values()[select].getPlayer().setEquippedSword(item);
                                            inv.remove(item);
                                        }
                                        else {
                                            TextUtils.invalidInput();
                                            showOptions();
                                        }
                                    }
                                    case  "SF", "SR", "MM", "YG", "WE", "DD", "BOTRK", "DB", "IE", "BT" -> {
                                        Item item = Swords.valueOf(itemSelect).getItem();
                                        if (inv.contains(item)) {
                                            Characters.values()[select].getPlayer().setEquippedSword(item);
                                            inv.remove(item);
                                        }
                                        else {
                                            TextUtils.invalidInput();
                                            showOptions();
                                        }
                                    }
                                    default -> {
                                        TextUtils.invalidInput();
                                        showOptions();
                                    }
                                }
                            }
                            case 1 -> {
                                TextUtils.showArmors();
                                String itemSelect = TextUtils.nextLine();
                                switch (itemSelect) {
                                    case "CA" -> {
                                        Item item = BasicItems.valueOf(itemSelect).getItem();
                                        if (inv.contains(item)) {
                                            Characters.values()[select].getPlayer().setEquippedSword(item);
                                            inv.remove(item);
                                        }
                                        else {
                                            TextUtils.invalidInput();
                                            showOptions();
                                        }
                                    }
                                    case "RO", "SV", "DP", "FN", "WA", "FG", "TC", "SA" -> {
                                        Item item = Armors.valueOf(itemSelect).getItem();
                                        if (inv.contains(item)) {
                                            Characters.values()[select].getPlayer().setEquippedSword(item);
                                            inv.remove(item);
                                        }
                                        else {
                                            TextUtils.invalidInput();
                                            showOptions();
                                        }
                                    }
                                    default -> {
                                        TextUtils.invalidInput();
                                        showOptions();
                                    }
                                }
                            }
                            default -> {
                                TextUtils.invalidInput();
                                showOptions();
                            }
                        }
                    }
                    default -> {
                        TextUtils.invalidInput();
                        showOptions();
                    }
                } else {
                    TextUtils.invalidInput();
                    showOptions();
                }
            }
            case 3 -> {
                TextUtils.unequipMenu();
                TextUtils.printPlayers();
                int select = TextUtils.nextInt();
                if (Characters.values()[select].getPlayer() != null) switch (select) {
                    case 0, 1, 2, 3, 4 -> {
                        TextUtils.unequipOption();
                        switch (TextUtils.nextInt()) {
                            case 0 -> {
                                if (Characters.values()[select].getPlayer().getEquippedSword() != null) {
                                    inv.add(Characters.values()[select].getPlayer().getEquippedSword());
                                    Characters.values()[select].getPlayer().setEquippedSword(null);
                                }
                            }
                            case 1 -> {
                                if (Characters.values()[select].getPlayer().getEquippedArmor() != null) {
                                    inv.add(Characters.values()[select].getPlayer().getEquippedArmor());
                                    Characters.values()[select].getPlayer().setEquippedArmor(null);
                                }
                            }
                            default -> {
                                TextUtils.invalidInput();
                                showOptions();
                            }
                        }
                    }
                    default -> {
                        TextUtils.invalidInput();
                        showOptions();
                    }
                } else {
                    TextUtils.invalidInput();
                    showOptions();
                }
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
