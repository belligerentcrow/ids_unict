public class Plant{
    private String species;
    private double maturationState;
    private int daysOfAge;
    private char section;
    private boolean parasites;

    public Plant(String sp, double mat, int wh, char sect, boolean p){
        this.species = sp;
        this.maturationState = mat;
        this.daysOfAge = wh;
        this.section = sect;
        this.parasites = p;
    }


    public double getMaturationState() {
        return maturationState;
    }
    public char getSection() {
        return section;
    }
    public String getSpecies() {
        return species;
    }
    public int getDaysOfAge() {
        return daysOfAge;
    }
    public boolean isParasitized(){
        return parasites;
    }

    @Override
    public String toString(){
        return this.species + ", days: " + daysOfAge + ", section: " +this.section;
    }
}