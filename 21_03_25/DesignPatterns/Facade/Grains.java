public class Grains {
    private int levelOfRoastness;
    private String quality;
    private int levelOfStaleness;
    private boolean hasBeenGround;
    private int levelOfGrind;
    private String originCharacteristics;


    public Grains(int roast, String q, int stale, String ori){
        this.levelOfRoastness = roast;
        this.levelOfStaleness = stale;
        this.quality = q;
        this.hasBeenGround = false;
        this.levelOfGrind = 0;
        this.originCharacteristics = ori;
    }

    public void groundBeans(int levGrind){
        this.hasBeenGround = true;
        this.levelOfGrind = levGrind;
    }

    public void addStale(int gettingStale){
        this.levelOfStaleness+=gettingStale;
    }


    public int getLevelOfGrind(){
        return this.levelOfGrind;
    }
    public int getLevelOfRoastness() {
        return this.levelOfRoastness;
    }
    public int getLevelOfStaleness() {
        return this.levelOfStaleness;
    }
    public String getQuality() {
        return this.quality;
    }
    public boolean getGroundStatus(){
        return this.hasBeenGround;
    }
    public String getOriginCharacteristics() {
        return originCharacteristics;
    }
}
