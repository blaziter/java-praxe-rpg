package com.company.Items;

public class DropItems {

    public static void getDroppedItem() {
        double randomNumber = genRan();
        if (randomNumber < 0.0001) {
            dropItem();
        }
        if (randomNumber < 0.01 && randomNumber > 0.0001) {
            dropBasic();
        }
        if (randomNumber < 0.1 && randomNumber > 0.01) {
            dropStarter();
        }
    }

    private static double genRan() {
        return Math.random();
    }

    private static void dropStarter() {
        Item droppedStarter = StarterItems.values()[(int) Math.floor(Math.random() * StarterItems.values().length)].getItem();
        Inventory.inv.add(droppedStarter);
        System.out.println("You found " + droppedStarter.getName());
    }

    private static void dropBasic() {
        Item droppedBasic = BasicItems.values()[(int) Math.floor(Math.random() * BasicItems.values().length)].getItem();
        Inventory.inv.add(droppedBasic);
        System.out.println("You found " + droppedBasic.getName());
    }

    private static void dropItem() {
        double randomNumber = genRan();
        Item droppedItem;
        if (randomNumber < 0.5) droppedItem = Armors.values()[(int) Math.floor(Math.random() * Armors.values().length)].getItem();
        else droppedItem = Swords.values()[(int) Math.floor(Math.random() * Swords.values().length)].getItem();
        Inventory.inv.add(droppedItem);
        System.out.println("You found " + droppedItem.getName());
    }
}
