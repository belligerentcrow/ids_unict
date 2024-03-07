import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class CalcolaImporti { 
    private final List<String> importi = new ArrayList<>();
    //List e Arraylist sono tipi della libreria Java
    // List non e' una classe !! E' una interfaccia

    private float totale; // tipo primitivo di java (notare : lettera minuscola)

    //throws = rilancia l'eccezione al chiamante (la IOException) che potrebbe capitare quando il file non esiste 
    //qui rimandiamo al chiamante ma in un altro tipo di programma piu' raffinato la possiamo gestire all'interno

    public float calcola(String c, String n) throws IOException {
        LineNumberReader f = new LineNumberReader(new FileReader(new File(c, n)));
        //lettura file tramite le API Java : File, FileReader, LineNumberReader
        totale = 0;

        while (true){
            final String riga = f.readLine(); //legge una riga dal file
            if (null == riga){
                break; //esce dal ciclo
            }
            if (importi.contains(riga)){
                continue;
            }
            importi.add(riga); // aggiunge in lista
            //non c'e' bisogno di includere java.lang
            totale += Float.parseFloat(riga); // converte da String a float
        }
        f.close();
        return totale;
    }
}
