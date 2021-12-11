package com.company.Game;

import com.company.Entities.Characters;
import com.company.Entities.Enemies;

public class Dungeon {
    private static double roomCount;
        /*3 - 8 easy
		5 - 12 medium
		10 - 18 hard
        random dungeon length last number = boss*/

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
            System.out.println((i + 1) + ". room out of " + (int) roomCount);
            Room.showEnemies();
            Fight.setup(Characters.values(), Enemies.values());
        }
    }

}
