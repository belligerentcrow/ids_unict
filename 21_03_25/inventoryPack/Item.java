package inventoryPack;

public class Item {
    private String name;
    private int quantity;

    public Item(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public String getName(){
        return this.name;
    }
    public int getQuantity(){
        return this.quantity;
    }

    @Override
    public String toString(){
        return "Item: " + name + ", Quantity: " + quantity;
    }
}
