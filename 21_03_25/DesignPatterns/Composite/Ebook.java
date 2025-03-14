package Composite;
/** Leaf2 */
public class Ebook implements Prodotto{
    private String titolo;
    private float prezzo;

    public Ebook(String t, float p){
        this.titolo = t;
        this.prezzo = p;
    }

    @Override
    public void print() {
        System.out.println("Ebook: "+getTitolo() + ", Prezzo: "+getPrezzo());
    }

    public String getTitolo() {
        return this.titolo;
    }

    @Override
    public float getPrezzo() {
        return (this.prezzo * (1-percSconto()/100));
    }

    @Override
    public void add(Prodotto p) {
        
    }

    @Override
    public void remove(Prodotto p) {
        
    }

    private float percSconto() {
		return 15;
	}


    @Override
    public int getPeso() {
        return 0;
    }
}
