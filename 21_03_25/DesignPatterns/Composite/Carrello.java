package Composite;

import java.util.ArrayList;
import java.util.List;

public class Carrello implements Prodotto{
    private List<Prodotto> nestedElem = new ArrayList<>();


    @Override
    public void print() {
        System.out.println("----------carrello---------");
        for(Prodotto p : nestedElem)
            p.print();
        System.out.println("---------------------------");
        System.out.println("Prezzo totale: " + getPrezzo());
    }

    @Override
    public float getPrezzo() {
        return nestedElem.stream().map(x->x.getPrezzo()).reduce(0f,Float::sum);
    }

    @Override
    public int getPeso() {
        return nestedElem.stream().map(x->x.getPeso()).reduce(0,Integer::sum);
    }

    @Override
    public void add(Prodotto p) {
        nestedElem.add(p);
    }

    @Override
    public void remove(Prodotto p) {
        nestedElem.remove(p);
    }
    
}
