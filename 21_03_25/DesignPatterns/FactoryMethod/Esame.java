package DesignPatterns.FactoryMethod;

public class Esame {
    private int voto;
    private String materia;
    
    public Esame(String m, int v){
        this.voto = v;
        this.materia = m;
    }

    public int getVoto(){
        return this.voto;
    }
    public String getMateria(){
        return this.materia;
    }
}
