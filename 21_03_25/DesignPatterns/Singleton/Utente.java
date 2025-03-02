package DesignPatterns.Singleton;

import java.time.LocalDate;


public class Utente{
    private String username;
    private String passw;
    private LocalDate dateJoined;

    public Utente(String username, String passw){
        this.username = username;
        dateJoined.now();
        this.passw = passw;
    }
    public String getUsername(){
        return this.username;
    }
    
    public Boolean checkPassword(String inserted){
        if(inserted == passw){
            return true;
        }else {
            return false;
        }
    }
}