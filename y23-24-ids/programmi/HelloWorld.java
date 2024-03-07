public class HelloWorld {
    private String nomeCorso = "Ingegneria del Software";

    public static void main(String[] args){
        //esiste anche solo print() che non va a capo dopo aver stampato
        // inoltre, la x: e' una cosa automatica che mette il compilatore

        System.out.println("Hello world :) ");
        //System.out.println(nomeCorso); 
        //da' errore perche' il metodo main e' static ma l'attributo nomeCorso non e' static.
        //static = vive all'interno della classe, non all'interno dell'istanza!
        //non static = ha bisogno di una istanza!
        //se nomeCorso non e' static e noi non abbiamo instanziato la classe HelloWorld 
        //non possiamo accedere alla stringa nomeCorso!

         //variabile di tipo HelloWorld, come si crea una istanza 
         // new crea spazio in memoria per l'istanza
         //il riferimento all'istanza viene passato a new su hw!
        HelloWorld hw = new HelloWorld();

        //stampo attributo di classe istanziata
        System.out.println(hw.nomeCorso);

        //chiamo altro metodo della stessa classe
        StampaData(hw.nomeCorso);

        //chiamo metodo di classe contenuta nella stessa cartella
        Schermo.stampa(hw.nomeCorso);
    }

    private static void StampaData(String saluto){
        System.out.println("7 marzo 2024");
        System.out.println(saluto); 
    }

}
