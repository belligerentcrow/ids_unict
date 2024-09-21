package StreamExercises.Es1;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;


//Produrre una lista che contiene solo le stringhe
// che cominciano con un certo prefisso noto

public class Esercizio1 {
    private List<String> mylist = new ArrayList<>(Arrays.asList("aurelio", "authentic", "throne", "really","aureum", "golden", "fantauxy")); 
    private String prefix = "au";
    private List<String> exList = Execute(mylist,prefix);
    

    public List<String> getList(){
        return this.mylist;
    }
    public String getPrefix(){
        return this.prefix;
    }

    public List<String> getExList(){
        return exList;
    }

    private List<String> Execute(List<String> list, String prefix){
        return list.stream().filter(s->s.substring(0, prefix.length()).equals(prefix)).collect(Collectors.toList());
    }
}
