package DesignPatterns.Singleton;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Login {
    private static Login obj;
    private List<UserLog> userLogs;

    private Login(){
        userLogs = new ArrayList<>();
    }

    public static Login getInstance(){
        if(obj == null)
            obj = new Login();
        return obj;
    }

    private void checkUserLog(Utente u1){
        if(userLogs.stream().noneMatch(x -> x.getUtente() == u1)){
            UserLog us = new UserLog(u1);
            userLogs.add(us);
        }
    }


    public Boolean userLogin(Utente u1, String mys){
        if(u1.checkPassword(mys)){
            System.out.println("The login has been successful. Welcome, "+ u1.getUsername() +"!");
            checkUserLog(u1);
            userLogs.stream().filter(x -> x.getUtente() == u1).findAny().get().newAccess(LocalDateTime.now());
            return true;
        }else{
            System.out.println("Login unsuccessful. Try again. ");
            checkUserLog(u1);
            userLogs.stream().filter(x -> x.getUtente() == u1).findAny().get().unsuccessfulAttempt();
            return false;
        }
    }
}
