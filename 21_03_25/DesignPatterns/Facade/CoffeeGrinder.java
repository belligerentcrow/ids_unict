public class CoffeeGrinder {
    private int levelOfGrinding;
    private int levelOfWear;

    public CoffeeGrinder(){
        this.levelOfGrinding = 6;
        this.levelOfWear = 0;
    }

    //1 = extra grossa
    //2 = grossa
    //3 = medio-grossa
    //4 = media
    //5 = medio-fine
    //6 = fine -- per espresso
    //7 = extra fine

    public void changeGrindingFineness(int gr){
        if(gr<=7 && gr>=1){
            this.levelOfGrinding = gr;
        }else{
            System.out.println("Must insert a valid grinding fineness.");
        }
    }

    public Grains grindCoffee(Grains grains){
        grains.groundBeans(this.getLevelOfGrinding());
        this.levelOfWear++;
        return grains;
    }

    public void clean(){
        this.levelOfWear = 0;
        System.out.println("The coffee grinder has been cleaned!");
    }

    public int getLevelOfGrinding() {
        return levelOfGrinding;
    }
    public int getLevelOfWear() {
        return levelOfWear;
    }

}
