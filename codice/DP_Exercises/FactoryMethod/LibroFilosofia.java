package FactoryMethod;

public class LibroFilosofia implements Libro {
    public String title; 

    public LibroFilosofia(String s){
        this.title = s;
        System.out.println("Filo!");
    }   
    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        return title;
    }
}
