package com.company.Items;

public enum StarterItems {
    DSB(new Sword("Doran's Blade", 8, 0, 2.5, 450, 80)),
    DS(new Sword("Doran's Shield", 5, 0, 0, 450, 120));

    private Item item;

    StarterItems(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
