public class HumanMaintenance {
    private MacchinaFacade machine;
    private Grains gr;
    
  
    public HumanMaintenance(MacchinaFacade mach){
        this.machine = mach;
        getGrainsFromCompany();
    }

    public void doMaintenance(){
        getGrainsFromCompany();
        this.machine.maintenance(this.gr);
    }
    
    public void assignNewMachine(MacchinaFacade mach){
        this.machine = mach;
    }

    public void getGrainsFromCompany(){
        int randRoast = (int)(Math.random() *11);
        int randQual = (int)(Math.random()*2);
        String qual = "";
        if(randQual == 0){
            qual = "Arabica";
        }else{
            qual = "Robusta";
        }
        String origins = "Brazilian brew";
        this.gr = new Grains(randRoast, qual, 5, origins);
    }
}
