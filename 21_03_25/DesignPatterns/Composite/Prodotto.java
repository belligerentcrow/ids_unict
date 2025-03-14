package Composite;

/** Component */
public interface Prodotto {
    public void print();
    public float getPrezzo();
    public int getPeso();
    public void add(Prodotto p);
    public void remove(Prodotto p);
}
