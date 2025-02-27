package DesignPatterns.FactoryMethod;

public class Sospeso implements IStudente{
    private float media;

    public Sospeso(float m){
        this.media = m;
    }

    public void nuovoEsame(String m, int v){
        System.out.println("Errore! Non è possibile sostenere esami");
    }

    public float getMedia(){
        return this.media;
    }
}
