public class Rosmarino implements Pianta {
    private int foglie;
    private double percentoAcqua;
    private String rosmarinotype;
    private int leafrate = 10;
    private double waterRate = 0.10;
    private final String[] varieta = {"Officinale", "Prostrato"};

    public Rosmarino(int t){
        foglie = 0;
        percentoAcqua = 0.25;
        rosmarinotype = varieta[t];
    }

    @Override
    public void cresce(){
        if (percentoAcqua-waterRate >= waterRate){
            foglie += leafrate;
            percentoAcqua -=waterRate;
        }else{
            System.out.println("Rosemary: Not enough water to grow!");
        }
    }

    @Override
    public int cediFoglie(String mode){
        if(foglie <= 0){System.out.println("No leaves left!");return 0;}
        else if (foglie ==1){System.out.println("Last leaf! Leaf it here!"); return 0;}
        else if (foglie ==2){System.out.println("Last 2 leaves! Took one"); return 1;}
        else{
            int picked = foglie;
            switch (mode) {
                case "aggressive":
                    foglie = 0;
                    break;
                case "half":
                    foglie = foglie/2;
                    picked = picked/2;
                    break;
                case "gentle":
                    foglie = foglie-(foglie/4);
                    picked = picked/4;
                    break;
                default:
                    System.out.println("Couldnt resolve mode of picking!");
                    break;
            }
            return picked;
        }
    }

    @Override
    public void getInnaffiato(double w){
        percentoAcqua = percentoAcqua+w;
        if(percentoAcqua > 1){
            System.out.println("Water overflowing!");
        }
    }

    @Override
    public void identifica(){
        System.out.println("Specie: " + rosmarinotype);
        System.out.println("n foglie: " + foglie);
        System.out.println("Livello acqua: "+ (percentoAcqua * 100) + "%\n");
    }

    @Override
    public String getType(){
        return rosmarinotype;
    }

    @Override
    public int getFoglie(){
        return foglie;
    }
}
