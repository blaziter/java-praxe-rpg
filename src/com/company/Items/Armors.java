package com.company.Items;

public enum Armors {
    RO(new Armor("Randuin's Omen", 250)),
    SV(new Armor("Spirit Visage", 450)),
    DP(new Armor("Dead Man's Plate", 300)),
    FN(new Armor("Force of Nature", 350)),
    WA(new Armor("Warmog's Armor", 800)),
    FG(new Armor("Frostfire Gauntlet", 350)),
    TC(new Armor("Turbo Chemtank", 350)),
    SA(new Armor("Sunfire Aegis", 350));

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
