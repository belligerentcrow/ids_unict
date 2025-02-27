package DesignPatterns.FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<IStudente> groupOfStudents = new ArrayList<>(); 
        
        IStudente s = StCreator.getStudente(true);
        s.nuovoEsame("Architettura degli Elaboratori", 31);
        groupOfStudents.add(s);
        
        System.out.println(groupOfStudents.get(0).getMedia());
    
        // can show media, cannot show, for example, the names of the subjects, because there is no method in IStudent which would let me do that. 
    }

    public void registra(){
        
    }
}
