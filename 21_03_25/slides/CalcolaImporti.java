import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class CalcolaImporti {
    private final List<String> importi = new ArrayList<>();
    private float totale, massimo;

    public float calcola(String c, String n) throws IOException {
        LineNumberReader f = new LineNumberReader(new FileReader(new File(c,n)));
        String riga;
        while(true){
            riga = f.readLine();
            if (null == riga) break;
            if (!importi.contains(riga))
                importi.add(riga);
        }
        f.close();
        //calcola tot
        totale = 0;
        for(int i = 0; i <importi.size(); i++)
            totale += Float.parseFloat(importi.get(i));

        //calcola massimo
        massimo = Float.parseFloat(importi.get(0));
        for (int i = 0; i < importi.size(); i++)
            if(massimo < Float.parseFloat(importi.get(i)))
                massimo = Float.parseFloat(importi.get(i));
        return totale;
    }
}
