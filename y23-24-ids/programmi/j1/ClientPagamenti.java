import java.io.IOException;

public class ClientPagamenti {
    public static void main(String[] args) {
        Pagamenti p = new Pagamenti();
        p.svuota();
        try{
            p.leggiFile("csv", "importi");
        } catch (IOException e) {e.printStackTrace();}
    
    p.calcolaSomma();
    p.calcolaMassimo();
    System.out.println(p.getSomma());
    System.out.println(p.getMassimo());
    
    }
}
