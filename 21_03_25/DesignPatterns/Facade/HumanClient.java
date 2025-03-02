package DesignPatterns.Facade;

public class HumanClient {
    private Espresso cofi;
    private String name;
    
    public HumanClient(String n){
        this.name = n;
    }

    public void getCofi(MacchinaFacade mach){
     try{  System.out.println(this.name + " is getting coffee!");
            this.cofi = mach.autoModeIsGo();
            cofi.drink();
            System.out.println(cofi.getTasted());
            cofi.drink();
            cofi.finished();
            cofi = null;
        } catch (Exception e) {
            System.out.println("Oh... no cofi...");
        }
    }
    public String getName() {
        return name;
    }
}
