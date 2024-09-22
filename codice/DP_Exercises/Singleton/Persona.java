package Singleton;

import java.util.stream.*;

public final class Persona {
    private String nome;
    private String cognome;
    private String CF; 

    private static Persona instance;
    private Persona(String n, String c){
        this.nome = n;
        this.cognome = c;
        CF = assignCF(n,c);
    }

    public Persona getInstance(){
        if(instance == null){
            instance = new Persona("Mario", "Rossi");
        }
        return instance;
        
    }

    private String assignCF(String nom, String cogn){
        String myCF = "";
        return myCF.concat(nom.substring(1,2)).concat(cogn.substring(3,4)).concat("1000").concat("C");
    }
}
