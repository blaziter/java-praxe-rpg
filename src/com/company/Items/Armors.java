package com.company.Items;

public enum Armors {
    RO(new Armor("Randuin's Omen", 250, 80, 2700)),
    SV(new Armor("Spirit Visage", 450, 40, 2900)),
    DP(new Armor("Dead Man's Plate", 300, 45, 2900)),
    FN(new Armor("Force of Nature", 350, 70, 2900)),
    WA(new Armor("Warmog's Armor", 800, 3000)),
    FG(new Armor("Frostfire Gauntlet", 350, 50, 2800)),
    TC(new Armor("Turbo Chemtank", 350, 50, 2800)),
    SA(new Armor("Sunfire Aegis", 350, 70, 3200));

    private Item item;

    Armors(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
