public class Giardiniere {
    int foglieRaccolte[] = {0,0}; 

    public void innaffiaPianta(double water, Pianta p){
        p.getInnaffiato(water);
        System.out.println("Watering "+p.getType()+"...");
    }
    public void raccogliFoglie(Pianta p, int index, String m){
        foglieRaccolte[index] = p.cediFoglie(m);
        System.out.println("Gathering from " + p.getType()+ "...");
    }
    public int getFoglie(int index){
        return foglieRaccolte[index];
    }
}
