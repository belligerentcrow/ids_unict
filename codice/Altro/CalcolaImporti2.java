public class CalcolaImporti2 { //LEGGERMENTE MEGLIO DI QUELLO DI PRIMA MA SEMPRE BRUTTO 
    private final List<String> importi = new ArrayList<>();
    private float totale, massimo;

    public float calcola(String c, String n) throws IOException{
       LineNumberReader f = new LineNumberReader(new FileReader(new File(c,n)));
       String riga;
       while(true){
        riga = f.readLine();
        if(null = riga) break; 
        if(!importi.contains(riga));
            importi.add(riga);
       }
       f.close();
       totale  = 0; 
       for(int i = 0; i<importi.size(); i++){
        totale += Float.parseFloat(importi)
       }

    }

}
