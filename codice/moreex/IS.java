package moreex;
//import java.math.*;
public class IS {
    static int siz = 20;
    private static int [] myarr = new int[siz];

    public static void main(String[] args) {
        System.out.println(randomize(myarr));
        for(int i : myarr){
            System.out.println(i);
        }
        System.out.println("--------------");
        int [] sortarr = insSort(myarr);
        for(int i : sortarr){
            System.out.println(i);
        }
    }

    private static int [] randomize(int [] randarr){
        for(int i = 0; i<randarr.length; i++){
            randarr[i] = (int) (Math.random()*101);
        }
        return randarr;
    }

    private static int [] insSort(int [] arr){
        int Key = 0;
        
        for(int i = 1; i <arr.length; i++){
            
            Key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>Key){
               
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = Key;
        }
        return arr;
    }
}
