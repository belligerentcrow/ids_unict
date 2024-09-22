package StreamExercises.Es5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Esercizio5_2 {
    private List<Integer> myList = new ArrayList<>();
    private List<Integer> myListNotOrdered= List.of(12,3,120,1290,10,30,50);
    private List<Integer> myListOrdered= List.of(1,23,44,55,66,77,88,99);
    int n =10;

    public void init(){
        fillList(myList, n);
    }

    public boolean checkList(List<Integer> listToCheck){
        return IntStream.rangeClosed(0,listToCheck.size()-2).filter(i->listToCheck.get(i)>listToCheck.get(i+1)).findAny().isEmpty();
    }

    public List<Integer> getList(int i){
        switch (i) {
            case 1:
                return myList;
            case 2: 
                return myListNotOrdered;
            case 3:
                return myListOrdered;
            default:
                return myListOrdered;
        }
    }

    public void printlist(List<Integer> printlist){
        printlist.forEach(System.out::println);
    }

    private void fillList(List<Integer> listnum, int n){
        for(int i = 0; i< n; i++){
            listnum.add((int) Math.round(Math.random()*10));
        }
    }
}
