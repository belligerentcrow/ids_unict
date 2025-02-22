import java.time.LocalDate;

public class HelloWorld {
    private static final String msg = "Preparazione studio per 21.03.25";
    private static final LocalDate d = LocalDate.now();

    public static void main(String [] args){
        System.out.println("Hello, World!");
        System.out.println(msg);
        System.out.println(d);
    }
}