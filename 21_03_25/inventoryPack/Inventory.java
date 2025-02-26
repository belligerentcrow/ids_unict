package inventoryPack;
import java.util.ArrayList;

public class Inventory{
    private ArrayList<Item> items; 

    public Inventory(){
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }
    public void displayInventory(){
        for(Item x : items){
           System.out.println(x.toString());
        }
    }
}