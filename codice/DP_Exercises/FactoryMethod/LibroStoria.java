package FactoryMethod;

public class LibroStoria implements Libro{
    public String title; 
    public LibroStoria(String s){
        this.title = s;
        System.out.println("storia!");
    }   
    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        return title;
    }
}
