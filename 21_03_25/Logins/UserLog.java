package Logins;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class UserLog {
    private Utente utente;
    private List<LocalDateTime> listaAccessi;
    private Integer unsuccessfulLogins;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");

    public String timeFormatter(LocalTime mytime){
        return mytime.format(formatter);
    }

    public UserLog(Utente user){
        this.listaAccessi = new ArrayList<>();
        this.unsuccessfulLogins = 0;
        this.utente = user;
    }

    public void unsuccessfulAttempt(){
        unsuccessfulLogins++;
        System.out.println("Attention! Registered an attempted login by "+ this.utente.getUsername() +" at " + timeFormatter(LocalTime.now())+ ". The current attempted logins number for this user is "+unsuccessfulLogins+".");
    }

    public void resetLoginCounter(){
        unsuccessfulLogins = 0;
    }

    public void newAccess(LocalDateTime myTime){
        listaAccessi.add(myTime);
    }

    public List<LocalDateTime> getListaAccessi() {
        return listaAccessi;
    }
    public Integer getUnsuccessfulLogins() {
        return unsuccessfulLogins;
    }

    public Utente getUtente() {
        return utente;
    }
}
