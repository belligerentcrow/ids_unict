package FactoryMethod;

public class Stampa {
    int type = 2;

    public Libro mandaInStampa(String s){
        if(type == 0)
            return StampaFilo(s);
        else if(type ==1)
            return StampaScienza(s);
        else
            return StampaStoria(s);
    }

    public Libro StampaFilo(String tit){
        return new LibroFilosofia(tit);
    }
    public Libro StampaScienza(String tit){
        return new LibroScienza(tit);
    }
    public Libro StampaStoria(String tit){
        return new LibroStoria(tit);
    }
}
