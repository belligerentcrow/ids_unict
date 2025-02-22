public class TestPagamentiTram {
    private Pagamenti ptest = new Pagamenti();
    private void initList(){
        ptest.svuota();
        ptest.inserisci("321.01");
        ptest.inserisci("531.7");
        ptest.inserisci("1234.5");
    }

    public void testSommaValori(){
        initList();
        if(ptest.getTotale() == 2087.21f){
            System.out.println("OK test somma val");
        }else{
            System.out.println("FAILED test somma val");
        }
    }

    public void testListaVuota(){
        ptest.svuota();
        if(ptest.getTotale() == 0) System.out.println("OK test somma val empty");
            else System.out.println("FAILED test somma val empty");
        if(ptest.getMassimo() == 0) System.out.println("OK test somma max val empty");
            else System.out.println("FAILED test somma max val empty");
    }
}
