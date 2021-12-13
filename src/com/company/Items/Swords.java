package com.company.Items;

public enum Swords {
    SF(new Sword("Serpent's Fang", 61, 0, 0, 2600)),
    SR(new Sword("Stormrazor", 67, 0, 0.2, 2700)),
    MM(new Sword("Muramana", 65, 0, 0, 2900)),
    YG(new Sword("Youmuu's Ghostblade", 64, 0, 0, 3000)),
    WE(new Sword("Wit's End", 56, 0, 0, 3100)),
    DD(new Sword("Death's Dance", 55, 0, 0, 3100)),
    BOTRK(new Sword("Blade of the Ruined King", 83, 0.1, 0, 3200)),
    DB(new Sword("Duskblade of Drakktar", 69, 0, 0, 3100)),
    IE(new Sword("Infinity Edge", 70, 0, 0.2, 3400)),
    BT(new Sword("Bloodthirster", 80, 0.2, 0, 3400));

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
