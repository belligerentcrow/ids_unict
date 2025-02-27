package DesignPatterns.FactoryMethod;

public class StCreator {

    public static IStudente getStudente(Boolean isRegularStudent){
        if(isRegularStudent) return new Studente();
        else return new Sospeso(0);
    }
}
