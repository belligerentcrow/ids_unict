package FactoryMethod;

public class Client {
   
    public static void main(String[] args) {
        Stampa s = new Stampa();
        Libro myli = s.mandaInStampa("ElementiGeometria");
        System.out.println(myli.getTitle());
    }
}
