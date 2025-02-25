import java.io.IOException;

public class TestPagamenti{
    private Pagamenti ptest = new Pagamenti();
    String maxStr = "208.88";
    private float max = Float.parseFloat(maxStr);
    
    private void initList(){
        ptest.svuota();
        ptest.inserisci("1.01");
        ptest.inserisci("2.20");
        ptest.inserisci("40.2");
        ptest.inserisci(maxStr);
    }
    
    private void testLeggi(){
        try{
            ptest.leggiFile("csv", "importi");
            System.out.println("SUCCESS test leggi file");
        } catch (IOException e) {
            System.out.println("FAILED test leggi file");
        }
    }

    private void testSomma(){
        initList();
        if(ptest.getTotale() == 40.2f+2.20f+1.01f+max){
            System.out.println("SUCCEEDED test somma");
        }else{
            System.out.println("FAILED test somma");
        }
        System.out.println(ptest.getTotale());
    }

    private void testMaxVal(){
        initList();
        ptest.calcolaMassimo();
        if(Math.abs(ptest.getMassimo() - Float.parseFloat(maxStr)) < 0.01){
            System.out.println("SUCCESS test calcola massimo");
        }else{
            System.out.println("FAILED test calcola massimo");
        }
        System.out.println(ptest.getMassimo());
    }

    public void testall(){
        testLeggi();
        testMaxVal();
        testSomma();
    }

}