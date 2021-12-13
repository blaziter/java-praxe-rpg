package com.company.Items;

public enum BasicItems {
    BFS(new Sword("B. F. Sword", 40, 0, 0, 1300)),
    CA(new Armor("Cloth Armor", 0, 15, 300)),
    LS(new Sword("Long Sword", 10, 0, 0, 350)),
    PA(new Sword("Pickaxe", 25, 0, 0, 875))
    ;

    private Item item;

    BasicItems(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
