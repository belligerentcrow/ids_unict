import java.util.ArrayList;
import java.util.stream.*;
import java.util.List;

public class PlantManager {
    
   public static void main(String[] args) {
        List<Plant> plants = new ArrayList<>();
        plants.add(new Plant("Rosemary",0.5,20,'A',false));
        plants.add(new Plant("Olive",0.8,30,'A', true));
        plants.add(new Plant("Tomato",0.2,10,'B',false));
        plants.add(new Plant("Olive",0.3,20,'C', false));
        plants.add(new Plant("Rosemary",0.1,5,'A', true));
        plants.add(new Plant("Zucchine",1,40,'B', true));
        plants.add(new Plant("Tomato",0.6,20,'C',true));
        plants.add(new Plant("Tomato",0.3,34,'B',false));
        plants.add(new Plant("Olive",0.2,10,'C',true));

        //1 - How many Tomato plants are there, without parasites?
        long sol1 = plants.stream().filter(x->x.getSpecies() == "Tomato").filter(x->x.isParasitized() == false).count();
        System.out.println("Sol1: " + sol1);

        //2 - Create a list with all the B and C section plants with a maturation state 0.5 or more
        List<Plant> sol2 = plants.stream().filter(x->x.getSection() == 'B' || x.getSection() == 'C').filter(x->x.getMaturationState() >=0.5).collect(Collectors.toList());
        System.out.println("Sol2 :" + sol2);

        //3 - List with all the Olive plants with parasites
        List<Plant> sol3 = plants.stream().filter(x->x.getSpecies() == "Olive"&&x.isParasitized() == true).collect(Collectors.toList());
        System.out.println("Sol3 :" + sol3);

        //4 - Is there a Rosemary plant in section C?
        Boolean sol4 = plants.stream().anyMatch(x->x.getSection() == 'C' && x.getSpecies()=="Rosemary");
        System.out.println("Sol4: " + sol4);

        //5 - How many parasitized plants in section A?
        long sol5 = plants.stream().filter(x->x.getSection()=='A' && x.isParasitized()==true).count();
        System.out.println("Sol5: " + sol5);

        //6 - List all the types of plants sorted by name
        List<String> sol6 = plants.stream().map(x->x.getSpecies()).distinct().sorted().collect(Collectors.toList());
        System.out.println("Sol6: " + sol6);
   }


}
