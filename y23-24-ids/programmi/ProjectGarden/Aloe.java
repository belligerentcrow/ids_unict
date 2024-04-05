public class Aloe implements Pianta{
    private int foglie;
    private double percentoAcqua;
    private int leafrate = 5;
    private double waterRate = 0.05;
    private String aloetype;
    private final String[] varieta = {"Ferox", "Vera", "Brevifolia"};

    public Aloe(int t){
        foglie = 0;
        percentoAcqua = 0.40;
        aloetype = varieta[t];
    }

    @Override
    public void cresce(){
        if ((percentoAcqua - waterRate) > waterRate){
            foglie += leafrate;
            percentoAcqua -=waterRate;
        }else{
            System.out.println("Aloe: Not enough water to grow!");
        }
    }

    public int cediFoglie(){
        int temp = foglie;
        foglie = 0;
        return temp;
    }
    public void getInnaffiato(double w){
        percentoAcqua = percentoAcqua+w;
        if(percentoAcqua > 1){
            System.out.println("Water overflowing!");
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
    public void identifica(){
        System.out.println("Specie: " + aloetype);
        System.out.println("n foglie: " + foglie);
        System.out.println("Livello acqua: "+ (percentoAcqua * 100) + "%\n");
    }

    @Override
    public String getType(){
        return aloetype;
    }

    @Override
    public int getFoglie(){
        return foglie;
    }
}
