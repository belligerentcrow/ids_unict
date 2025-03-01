package DesignPatterns.Adapter;

//Adaptee
public class CompanySender {
    private String address;
    private Integer IDNumber;
    private Boolean isRegisteredPost;
    
    public String getAddress() {
        return this.address;
    }
    public Integer getIDNumber() {
        return this.IDNumber;
    }
    public Boolean getIsRegisteredPost() {
        return this.isRegisteredPost;
    }

    public CompanySender(String a, Integer id, Boolean b){
        this.address = a;
        this.IDNumber = id;
        this.isRegisteredPost = b;
    }

    public void status(){
        if(this.isRegisteredPost){
            System.out.println("The package #" + this.IDNumber + " is at the location...");
        }else{
            System.out.println("Untraceable package.");
        }
    }
}
