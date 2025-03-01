package DesignPatterns.Adapter;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Adapter
public class Repackager implements TargetPackage{
    private String address;
    private Integer IDNumb;
    CompanySender mySender;

    public Repackager(String a, int id){
        this.IDNumb = id;
        this.address = a;
        mySender = new CompanySender(address, id, extractBoolean(getID()));
    }

    public void gimmeDetails(){
        mySender.status();
    }

    private Boolean extractBoolean(Integer id){
        String c = IntStream.range(0,(int)Math.floor(Math.log10(id))).mapToObj(e->"0").collect(Collectors.joining(""));
        String t = "1".concat(c);
        Integer maxi = id/Integer.parseInt(t);
        if(maxi <=5){
            return false;
        }else{
            return true;
        }
    }

    public String getAddress(){
        return this.address;
    }
    public Integer getID(){
        return this.IDNumb;
    }
    

}
