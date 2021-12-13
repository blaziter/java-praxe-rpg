package com.company.Game;

import com.company.Entities.Boss;
import com.company.Entities.Characters;
import com.company.Entities.Enemies;
import com.company.Main;

public class Dungeon {
    private static double roomCount;

    private static void setRoomCount() {
        switch (Game.difficulty) {
            case "easy" -> {
                roomCount = Math.floor(Math.random() * (8 - 3 + 1) + 3);
            }
            case "normal" -> {
                roomCount = Math.floor(Math.random() * (12 - 5 + 1) + 5);
            }
            case "hard" -> {
                roomCount = Math.floor(Math.random() * (18 - 10 + 1) + 10);
            }
        }
    }

    public static void genDung() {
        setRoomCount();
        for (int i = 0; i < roomCount; i++) {
            System.out.println((i + 1) + ". room out of " + (int) (roomCount));
            if (i < roomCount - 1) {
                Room.showEnemies();
                Fight.setup(Characters.values(), Enemies.values());
            }
            if (i == roomCount - 1) {
                System.out.println("Please select which character will fight with a boss");
                Game.printPlayers();
                int selected;
                do {
                    selected = Main.scan.nextInt();
                    if (selected < 0 || selected > 4 || Characters.values()[selected].getPlayer() == null) System.out.println("Invalid input or your character does not exist");
                } while (selected < 0 || selected > 4 || Characters.values()[selected].getPlayer() == null);
                Fight.fight(Characters.values()[selected].getPlayer(), Boss.values()[Boss.values().length - 4].getBoss());
                //Fight.fight(Characters.values()[selected].getPlayer(), Boss.values()[(int) Math.floor(Math.random() * (Boss.values().length - 1))].getBoss());
            }
        }

    }

}
