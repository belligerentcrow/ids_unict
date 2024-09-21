package StreamExercises.Es3;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;

public class Esercizio3 {
    
    private List<Integer> exList = List.of(2,2,4,6,3,6,3,3,4,5);

    private List<int[]> myList = Arrays.asList(new int [] {2,2,4}, new int[] {2,4,6}, new int []{4,6,3}, new int [] {6,3,6}, new int [] {3,6,3}, new int[] {6,3,3}, new int[]{3,3,4}, new int []{3,4,5});

    public List<Integer> outList3 = calcPerimeters(checkTriangle(myList));

    public List<Integer> outList3_2 = calcPerimeters(checkTriangleIntsList(exList));

    private List<int []> checkTriangle(List<int[]> listInt){
        return listInt.stream().filter(t->t[0]<t[1]+t[2]).filter(t->t[1]<t[0]+t[2]).filter(t->t[2]<t[0]+t[1]).collect(Collectors.toList());
    }
    private List<int []> checkTriangleIntsList(List<Integer> listInt){
        return IntStream.rangeClosed(0, listInt.size()-3).mapToObj(i->new int[]{listInt.get(i),listInt.get(i+1),listInt.get(i+2)}).filter(t->t[0]<t[1]+t[2]).filter(t->t[1]<t[0]+t[2]).filter(t->t[2]<t[1]+t[0]).collect(Collectors.toList());
    }

    private List<Integer> calcPerimeters(List<int []> triangleList){
        return triangleList.stream().map(e->e[0]+e[1]+e[2]).collect(Collectors.toList());
    }
}
