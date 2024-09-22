package DP_Exercises.Singleton;

public class CodiceFiscale {
    public String assignCF(String nom, String cogn){
        String myCF = "";
        return myCF.concat(nom.substring(1,2)).concat(cogn.substring(3,4)).concat("1000").concat("C");
    }
}
