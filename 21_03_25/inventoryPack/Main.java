package inventoryPack;

public class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        Weapon item1 = new Weapon(20, "Ranged", "Bow", 1);
        Item item2 = new Item("Arrows", 20);
        Fruit item3 = new Fruit("Cosmic", "Apples", 4);
        Weapon item4 = new Weapon(100, "Melee", "Sword", 1);

        inv.addItem(item1);
        inv.addItem(item2);
        inv.addItem(item3);
        inv.addItem(item4);

        inv.displayInventory();

    }

}
