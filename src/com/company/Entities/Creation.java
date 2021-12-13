package com.company.Entities;

import com.company.Items.StarterItems;
import com.company.Main;

import java.util.Arrays;

public class Creation {

    private static int count = 0;
    private static Races race;
    private static int role;
    private static String sRace;
    private static String iRole;

    public static void enterRace() {
        switch (sRace = Main.scan.nextLine().toLowerCase()) {
            case "human", "voidborn", "golem", "demon", "yordle", "wraith", "troll", "vastaya" -> race = Races.valueOf(sRace.toUpperCase());
            default -> {
                System.out.println("Invalid input");
                enterRace();
            }
        }
    }

    private static void doDefault() {
        System.out.println("Wrong role for a race!");
        enterRole();
    }

    private static void wrongRace() {
        if (iRole.toUpperCase().equals(Races.GOLEM) || iRole.toUpperCase().equals(Races.TROLL)) doDefault();
    }

    public static void enterRole() {
        switch (iRole = Main.scan.nextLine().toLowerCase()) {
            case "warrior" -> {
                role = 0;
                return;
            }
            case "archer" -> {
                wrongRace();
                role = 1;
                return;
            }
            case "assassin" -> {
                wrongRace();
                role = 2;
                return;
            }
            default -> {
                doDefault();
            }
        }
    }

    public static void create() {
        count++;
        if (count >= 6) {
            System.out.println("Too many characters!");
            return;
        }
        System.out.println("What is your desired name?");
        String name = Main.scan.nextLine();

        System.out.println("What is your desired race? Available: " + Arrays.toString(Races.values()));
        enterRace();

        System.out.println("What is your desired role? Available: " + Arrays.toString(Races.valueOf(race.toString()).getRole()));
        enterRole();

        Player player = new Player(name, 1, race, race.getRole()[role], race.getHp()[role], race.getDmg()[role]);
        switch (player.getRole()) {
            case "Warrior" -> {
                player.setEquippedWeapon(StarterItems.DS.getItem());
            }
            case "Archer", "Assassin" -> {
                player.setEquippedWeapon(StarterItems.DB.getItem());
            }
        }
        switch (count) {
            case 1 -> {
                Characters.FIRST_CHARACTER.setPlayer(player);
            }
            case 2 -> {
                Characters.SECOND_CHARACTER.setPlayer(player);
            }
            case 3 -> {
                Characters.THIRD_CHARACTER.setPlayer(player);
            }
            case 4 -> {
                Characters.FOURTH_CHARACTER.setPlayer(player);
            }
            case 5 -> {
                Characters.FIFTH_CHARACTER.setPlayer(player);
            }
        }
    }

    public static void delete() {
        count--;
    }

}
