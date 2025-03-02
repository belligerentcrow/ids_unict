package Logins;

public class Client {
    public static void main(String[] args) {
        Login myLog = Login.getInstance();
        Utente utente1 = new Utente("Crowyx", "root");

        myLog.userLogin(utente1,"1234");
        myLog.userLogin(utente1,"2345");
        myLog.userLogin(utente1,"root");
        
    }
}
