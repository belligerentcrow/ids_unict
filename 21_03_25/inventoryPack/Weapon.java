package inventoryPack;

public class Weapon extends Item {
    private int damage;
    private String type;

    public Weapon(int damage, String type, String name, int quantity){
        super(name, quantity);
        this.damage = damage;
        this.type = type;
    }
    public int getDamage(){
        return this.damage;
    }
    public String getType(){
        return this.type;
    }

    @Override
    public String toString(){
        return "Name: " + getName() + ", Quantity: " +getQuantity() + ", Damage: " + getDamage() + ", Type: " + getType();
    }
}
