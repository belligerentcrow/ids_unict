public class CoffeePourer {
    private int temperature; //celsius..
    private int velocityOfPouring;
    private int levelOfWear;
    private int waterLevel;



    public CoffeePourer(){
        this.temperature = 12;
        this.velocityOfPouring = 5;
        this.levelOfWear = 0;
        this.waterLevel = 0;
    }


    public Espresso pourCoffee(Grains gr){
        //Need to incorporate temperature and velocity of pouring into all this!
        int acid = gr.getLevelOfRoastness()/2; 
        int bitt = gr.getLevelOfRoastness()*2;
        if(gr.getQuality() == "Arabica"){
            bitt *= 2;
        }
        this.levelOfWear++;
        this.waterLevel--;
        Espresso esp = new Espresso(acid, bitt, gr.getQuality(), gr.getOriginCharacteristics());
        return esp;
    }

    public void pourerMaintenance(){
        this.waterLevel = 20;
        this.levelOfWear = 0;
        System.out.println("Pourer has been maintained!");
    }

    public int getTemperature() {
        return temperature;
    }
    public int getLevelOfWear() {
        return levelOfWear;
    }
    public int getVelocityOfPouring() {
        return velocityOfPouring;
    }
    public int getWaterLevel() {
        return waterLevel;
    }
}
