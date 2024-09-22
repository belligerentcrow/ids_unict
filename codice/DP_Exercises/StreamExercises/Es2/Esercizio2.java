package StreamExercises.Es2;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;

public class Esercizio2 {
    private List<String> myList = new ArrayList<>(Arrays.asList("to","speak","the","truth","and","pay","your","debts"));
    String myString;

    private String outpString = produceString(myList);

    public String getOutpString(){
        return outpString;
    }

    private String produceString(List<String> list){
        return list.stream().map(s->s.substring(0,1)).collect(Collectors.joining());
    }
}
