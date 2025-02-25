public final class Singleton{
    private static Singleton instance;
    private String value;

    private Singleton(String val){
        this.value = val;
    }

    public static Singleton getInstance(String v){
        if(instance == null){
            instance = new Singleton(v);
        }
        return instance;
    }
    public String getValue(){
        return this.value;
    }
}