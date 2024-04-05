import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
//import java.util.List;

public class Pagamenti {
    private ArrayList<String> importiLetti = new ArrayList<>();
    //private List<Float> valori = new ArrayList<>(); //Per forza Float con la lettera maiuscola perche' serve un tipo non primitivo.
    private float totale, massimo;
    public void leggiFile(String c, String n) throws IOException {
        LineNumberReader f = new LineNumberReader(new FileReader(new File(c, n)));
        String riga; // potrebbe essere convertito in un oggetto con dei metodi a se' stante SE serve --> non ci stiamo ponendo il problema 
        while (true){
            riga = f.readLine();
            if (null == riga) {
                break;
            }
            inserisci(riga);
        }
        f.close();
    }
    public void inserisci(String riga){
        if (!importiLetti.contains(riga)) {importiLetti.add(riga);}
    }  
    public void calcolaSomma(){
        totale = 0;
        for (String v : importiLetti){
            totale += Float.parseFloat(v);
        }
    }
    public void calcolaMassimo(){
        massimo = 0;
        for (String v : importiLetti){
            if (massimo < Float.parseFloat(v)){
                massimo = Float.parseFloat(v);
            }
        }
    }
    public void svuota(){
        importiLetti = new ArrayList<>();
        totale = massimo = 0;
    }
    public float getMassimo(){
        return massimo;
    }
    public float getSomma(){
        return totale;
    }
}
