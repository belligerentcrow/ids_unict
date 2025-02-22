import java.io.IOException;

public class PagMain {

    public static void main(String[] args){
        Pagamenti p = new Pagamenti();
        try {
            p.leggiFile("csv", "importi");
        } catch (IOException e){}
        p.calcolaSomma();
        p.calcolaMassimo();

        TestPagamenti ptesting = new TestPagamenti();
        ptesting.testall();
        TestPagamentiTram ptest2 = new TestPagamentiTram();

        ptest2.testSommaValori();
        ptest2.testListaVuota();

    }
}
