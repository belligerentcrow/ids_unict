package Altro;

//nome di un modulo software
import java.time.LocalDate; 



/**
    classe che stampa sullo schermo un messaggio e la data corrente
 */

public class lez2{ //definizione classe <-- NOME della funzione più esterna DEV'ESSERE UGUALE AL NOME DEL FILE
    //dichiarazione e assegnazione campi
    private static final String msg = "Lezione di ingegneria del software 2"; 
    private static final LocalDate d = LocalDate.now(); 

    //metodo da cui inizia l'esecuzione del programma 

    // @param args parametri passati al metodo all'avvio della classe

    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println(msg);
        System.out.println(d);
    }

}