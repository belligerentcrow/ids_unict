package DesignPatterns.FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public class Studente implements IStudente {
    private List<Esame> esami = new ArrayList<>();
    public void nuovoEsame(String m, int v){
        Esame e = new Esame(m,v);
        esami.add(e);
    }
    
    public float getMedia(){
        if(esami.isEmpty())
            return 0;
        else return (esami.stream()
                         .map(Esame::getVoto)
                         .reduce(0, (accum,v)->accum+v))/esami.size();
    }
}
