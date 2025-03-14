package Composite;

/** Leaf1 */
public class Libro implements Prodotto {
    private String titolo;
    private float prezzo;
    private int peso;

    public Libro(String titol, float prez, int pes){
        this.titolo = titol;
        this.prezzo = prez;
        this.peso = pes;
    }

    @Override
    public void print() {
        System.out.println("Libro: "+getTitolo() + ", Prezzo: "+ getPrezzo());
    }

    @Override
    public float getPrezzo() {
        return this.prezzo;
    }

    @Override
    public int getPeso() {
        return this.peso;
    }

    public String getTitolo() {
        return this.titolo;
    }

    @Override
    public void add(Prodotto p) {
        
    }

    @Override
    public void remove(Prodotto p) {
        
    }
    
}
