import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class Pagamenti {
    private List<String> importi = new ArrayList<>();
    private float totale, massimo; 

    public void leggiFile(String c, String n) throws IOException{
        LineNumberReader f = new LineNumberReader(new FileReader(new File(c,n)));
        String riga;
        while(true){
            riga = f.readLine();
            if (null == riga) break;
            inserisci(riga);
        }
        f.close();
    }

    public void inserisci(String riga){
        if(!importi.contains(riga)) importi.add(riga);
    }

    public void calcolaSomma(){
        totale = 0;
        for (String v : importi)
            totale += Float.parseFloat(v);

        System.out.println("calctot : " + totale);
    }

    public void calcolaMassimo(){
        massimo = 0;
        for(String v : importi)
            if(massimo < Float.parseFloat(v)){
                massimo = Float.parseFloat(v);
            }
        System.out.println("calcmax : " + massimo);
    }

    public void svuota(){
        importi = new ArrayList<>();
        totale = massimo = 0;
    }

    public float getMassimo(){
        return massimo;
    }

    public float getTotale(){
        return totale;
    }
}
