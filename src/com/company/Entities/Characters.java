package com.company.Entities;

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
}
