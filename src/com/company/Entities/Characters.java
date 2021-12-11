package com.company.Entities;

import com.company.Main;

public enum Characters {
    FIRST_CHARACTER(),
    SECOND_CHARACTER(),
    THIRD_CHARACTER(),
    FOURTH_CHARACTER(),
    FIFTH_CHARACTER();

    Player player;

    Characters() {

    }

    Characters(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public static void restorePlayers() {
        int role = 0;
        for (int i = 0; i < Characters.values().length; i++) {
            if (Characters.values()[i] != null) {
                switch (Characters.values()[i].getPlayer().getRole().toLowerCase()) {
                    case "warrior" -> {
                        role = 0;
                    }
                    case "archer" -> {
                        role = 1;
                    }
                    case "assassin" -> {
                        role = 2;
                    }
                }
                if (Characters.values()[i] != null) Characters.values()[i].getPlayer().setHp(Math.floor(Races.valueOf(Characters.values()[i].getPlayer().getRace().toString()).getHp()[role] + (Characters.values()[i].getPlayer().getLvl() * 35.92)));
            }
            return;
        }
    }
}
