import java.util.ArrayList;
import java.util.List;

public class MacchinaFacade {
    private static MacchinaFacade machine;
    private CoffeeGrinder coffGrind;
    private CoffeePourer coffPour;
    private List<Grains> machineGrains;

    private MacchinaFacade(){
        this.coffGrind = new CoffeeGrinder();
        this.coffPour = new CoffeePourer();
        machineGrains = new ArrayList<>();
    }

    public static MacchinaFacade getInstance(){
        if (machine == null)
            machine = new MacchinaFacade();
        return machine;
    }

    public void maintenance(Grains grains){
        coffGrind.clean();
        coffPour.pourerMaintenance();
        for(int i = 0; i<5; i++){
            machineGrains.add(grains);
        }
    }

    public Espresso autoModeIsGo() throws Exception{
        //TO-DO!
            coffGrind.changeGrindingFineness(6);
            if(!(machineGrains.isEmpty()) && coffPour.getWaterLevel()>=1){
                coffGrind.grindCoffee(machineGrains.get(0));
                //other methods to get coffee
                machineGrains.remove(0);
                return coffPour.pourCoffee(machineGrains.get(0));
            }else {
                if(machineGrains.isEmpty())
                    throw new Exception("No Coffee grains!");
                else if(coffPour.getWaterLevel()<1){
                    throw new Exception("No water!");
                }else{
                    throw new Exception("Couldn't brew coffee!");
                }
            }

        }
            
    /*public Espresso experiencedMode(Grains grains){
        //TO-DO!
        return new Espresso();
    }*/
    public int howManyGrainsLeft(){
        System.out.println("There are "+ machineGrains.size() + " grains left in this machine.");
        return machineGrains.size();
    }
}
