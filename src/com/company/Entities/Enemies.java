package com.company.Entities;

public enum Enemies {
    FIRST_CHARACTER(),
    SECOND_CHARACTER(),
    THIRD_CHARACTER(),
    FOURTH_CHARACTER(),
    FIFTH_CHARACTER();

    Enemy enemy;

    Enemies() {

    }

    Enemies(Enemy enemy) {
        this.enemy = enemy;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }
}
