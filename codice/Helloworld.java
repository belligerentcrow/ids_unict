import java.time.LocalDate;  //indica dove trovare la classe LocalDate

public class Helloworld { //dichiara classe Helloworld
    private static final String msg = "Lezione di ingegneria"; 
    private LocalDate d; //dichiara campo d di tipo LocalDate

    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println(msg);
        final Helloworld world = new Helloworld(); //crea oggetto
        world.printDate(); //chiama metodo
    }

    private void printDate(){//metodo
        d = LocalDate.now(); //chiama metodo static now 
        System.out.println(d);
    }
}

//il codice della classe helloworld deve essere salvato  sul file helloworld.java, compilcato con javac helloworld.java ed eseguito con java helloworld
