package StreamExercises.Es5;

import java.util.List;
import java.util.stream.IntStream;
import java.util.ArrayList;

//Data una lista di numeri interi positivi
//Verificare se la lista sia ordinata
public class Esercizio5 {
    private List<Integer> myList = List.of(12,43,10,30,102,10,21,1,2);
    private List<Integer> myList2 = List.of(1,2,3,4,5,6,7,8,9,10);

    public boolean checkList(int a){
        if (a == 0){return checkSort(myList);}
        else if(a==1){return checkSort(myList2);}
        else {return false;}
    }
    
    private boolean checkSort(List<Integer> list){
        //return list.stream().generate(()->).limit(list.size()-1);
        return IntStream.rangeClosed(0, list.size()-2).filter(i->list.get(i)>list.get(i+1)).findAny().isEmpty();
    }
}
