public class Cliente {
    public static Creatore myCreatore = new Creatore();
    public static void main(String[] args) {
        Pianta miaPianta = plantnew();
        miaPianta.identifica();
        Giardiniere samwise = gardnew(); 
        miaPianta.cresce();
        miaPianta.identifica();
        miaPianta.cresce();
        miaPianta.identifica();
        samwise.raccogliFoglie(miaPianta, 0, "half");
        miaPianta.identifica();
        samwise.innaffiaPianta(0.5, miaPianta);
        miaPianta.identifica();
    }
    public static Pianta plantnew(){
        Pianta myplant = myCreatore.getPianta(false);
        return myplant;
    }
    public static Giardiniere gardnew(){
        Giardiniere mygard = myCreatore.getGiardiniere();
        return mygard;
    }
}
