public class usualDay {
    public static void main(String[] args) {
        MacchinaFacade machine = MacchinaFacade.getInstance();
        HumanClient a1 = new HumanClient("Alice");
        HumanClient a2 = new HumanClient("Bob");
        HumanMaintenance maint1 = new HumanMaintenance(machine);
        
        maint1.doMaintenance();
        a1.getCofi(machine);
        a2.getCofi(machine);
        a1.getCofi(machine);
        a2.getCofi(machine);
        a2.getCofi(machine);
        maint1.doMaintenance();
        a1.getCofi(machine);
    }
    
}
