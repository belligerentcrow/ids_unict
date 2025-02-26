package inventoryPack;

public class Fruit extends Item{
    //its unnecessary to list superclass attributes cause they are inherited!
    private String type;
    public Fruit(String type, String name, int quantity){
        super(name, quantity);
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    @Override
    public String toString(){
        return "Name: " + getName() + ", Quantity: " + getQuantity() + ", Type: " + getType();
    }
}
