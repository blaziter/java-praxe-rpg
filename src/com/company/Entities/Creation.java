package com.company.Entities;

import com.company.Main;

import java.util.Arrays;

public class Creation {

    private static int count = 0;
    public static Races race;
    public static int role;
    private static String sRace;
    private static int iRace;

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
        System.out.println("Invalid input");
        enterRole();
    }

    public static void enterRole() {
        switch (iRace = Main.scan.nextInt()) {
            case 0, 1, 2, 3 -> {
                if (Races.valueOf(sRace.toUpperCase()).equals(Races.TROLL) && iRace > 0) doDefault();
                role = iRace;
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

        System.out.println("What is your desired role? Available: " + Arrays.toString(Races.valueOf(race.toString()).getRole()) + "\nEnter your role as a number from range 0 to " + (Races.valueOf(race.toString()).getRole().length - 1));
        enterRole();

        Main.scan.nextLine();
        Player player = new Player(name, 1, race, race.getRole()[role], race.getHp()[role], race.getDmg()[role],race.getMana()[role]);
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
