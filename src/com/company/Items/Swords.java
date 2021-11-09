package com.company.Items;

public enum Swords {
    SF(new Sword("Serpent's Fang", 61)),
    SR(new Sword("Stormrazor", 67, 0, 0.2)),
    MM(new Sword("Muramana", 65)),
    YG(new Sword("Youmuu's Ghostblade", 64)),
    WE(new Sword("Wit's End", 56)),
    DD(new Sword("Death's Dance", 55)),
    BOTRK(new Sword("Blade of the Ruined King", 83, 0.1)),
    DB(new Sword("Duskblade of Drakktar", 69)),
    IE(new Sword("Infinity Edge", 70, 0, 0.2)),
    BT(new Sword("Bloodthirster", 80, 0.2));

    private Item item;

    Swords(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
