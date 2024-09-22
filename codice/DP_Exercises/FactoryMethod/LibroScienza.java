package FactoryMethod;

public class LibroScienza implements Libro {
    public String title; 
    public LibroScienza(String s){
        this.title = s;
        System.out.println("scienza!");
    }   
    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        return title;
    }
}
