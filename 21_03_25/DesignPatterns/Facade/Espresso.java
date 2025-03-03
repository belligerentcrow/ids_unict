public class Espresso {
    private int acidity;
    private int bitterness;
    private String type;
    private String characteristics;


    public Espresso(int a, int bitt, String ty, String chara){
        this.acidity = a;
        this.bitterness = bitt;
        this.type = ty;
        this.characteristics = chara;
    }


    public void drink(){
        System.out.println("Sluuuurp... nice!");
    }

    public void finished(){
        this.acidity = 0;
        this.bitterness = 0;
        this.type = "None";
        this.characteristics = "Empty cup";
        System.out.println("Finished coffee!");
    }

    public String getTasted(){
        return "This Espresso is of the " + getType()+ " quality. Its acidity level: " + this.getAcidity() + ", bitterness: " + this.getBitterness() + ", and its characteristics are: "+ this.getCharacteristics() + ".";
    }

    public int getAcidity() {
        return this.acidity;
    }
    public int getBitterness() {
        return bitterness;
    }
    public String getCharacteristics() {
        return characteristics;
    }
    public String getType() {
        return type;
    }
}
