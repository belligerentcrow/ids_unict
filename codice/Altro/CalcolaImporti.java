package Altro;
//lettura files e somma

import java.io.File; // gestire i files
import java.io.FileReader; // leggere dentro i files
import java.io.IOException; //struttura in grado di gestire eccezioni - La IOException è la più generica (?)
import java.io.LineNumberReader; //permette di leggere una linea (tutti i caratteri fino a invio) oltre al numero di riga di essa
import java.util.ArrayList; //se vogliamo calcolare e avere a disposizioni una struttura dinamica (è una lista ma come un array)
import java.util.List; //per potere usare arraylist come LISTA


public class CalcolaImporti{  //classe java vers 0.0.1
    private final List<String> importi = new ArrayList<>();   
    //list e Arraylist sono tipi della libreria java
    private float totale; 
    public float calcola(String c, String n) throws IOException {
        LineNumberReader f = new LineNumberReader(new FileReader(new File(c,n)));
        //lettura file tramite le API Java. File, filereader, linenumberreader

        totale = 0; 
        while(true){
            final String riga = f.readLine(); //legge una riga dal file
            if(null == riga) break;  //esce dal ciclo
            importi.add(riga);      //aggiunge in lista
            totale += Float.parseFloat(riga);
        }
        f.close();  //chiude file
        return totale; //restituisce totale al chiamante
    }
}

//bisognava includere i files in try catch: posso evitarlo perché ho messo il throws IOException
//non lo chiamo io ma chi chiamerà QUESTA funzione la deve mettere in un trycatch altrimenti potrebbe sollevare eccezioni 


