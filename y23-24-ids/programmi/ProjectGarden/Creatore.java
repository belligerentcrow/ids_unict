import java.util.Random;

public class Creatore {
    public static Giardiniere getGiardiniere(){
        Giardiniere gard = new Giardiniere();
        return gard;
    }

    public static Pianta getPianta(boolean p){
        if (p){ 
            int r = new Random().nextInt(2);
            return new Rosmarino(r);
        }else {
            int r = new Random().nextInt(3);
            return new Aloe(r);
        }
    }    
}
