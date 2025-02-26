package inventoryPack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        Weapon item1 = new Weapon(20, "Ranged", "Bow", 1);
        Item item2 = new Item("Arrows", 20);
        Fruit item3 = new Fruit("Cosmic", "Apples", 4);
        Weapon item4 = new Weapon(100, "Melee", "Sword", 2);
        Fruit item5 = new Fruit("Fuji", "Apples", 2);
        Weapon item6 = new Weapon(120, "Melee", "Greatsword", 1);
        Weapon item7 = new Weapon(5, "Melee", "Stick", 5);

        inv.addItem(item1);
        inv.addItem(item2);
        inv.addItem(item3);
        inv.addItem(item4);

       // inv.displayInventory();


        // utilizzo streams
        ArrayList<Item> myItems = new ArrayList<>();
        myItems.add(item1);
        myItems.add(item2);
        myItems.add(item3);
        myItems.add(item4);
        myItems.add(item5);
        myItems.add(item6);
        myItems.add(item7);

        List<String> tooMany = myItems.stream().filter(d -> d.getQuantity()>10).map(x -> x.getName()).toList();
        
        //weapon with the highest damage
        List<String> ouchie = myItems.stream()
                               .filter(x -> x instanceof Weapon)
                               .map(Item::getName)
                               .collect(Collectors.toList());
        System.out.println(ouchie);

        for(String x : tooMany){
            System.out.println(x);
        }
        
    }

}
