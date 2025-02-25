package streams;

//immutable class used as data for the stream chapter of the Java 8 book - chapter 4
public class Dish {

    //characteristics that each dish has
    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    //constructor: assigns to each dish the parameters we send to it
    public Dish(String name, boolean vegetarian, int calories, Type type){
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    //Getters: public methods which help retrieve the values of the class which would otherwise have a private scope

    public String getName(){
        return this.name;
    }
    public boolean isVegetarian(){
        return this.vegetarian;
    }
    public int getCalories(){
        return this.calories;
    }
    public Type getType(){
        return this.type;
    }

    //being real no idea what this is yet
    @Override
    public String toString(){
        return name;
    }

    //this creates an enumeration; a type which can assume one of these three value inside of curly brackets
    public enum Type {MEAT, FISH, OTHER}
}
