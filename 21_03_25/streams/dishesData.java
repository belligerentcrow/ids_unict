package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class dishesData{
    //had to make it static for the main
    static List<Dish> menu = Arrays.asList(
        new Dish("pork", false,800, Dish.Type.MEAT),
        new Dish("beef", false, 700, Dish.Type.MEAT),
        new Dish("chicken", false, 400, Dish.Type.MEAT),
        new Dish("french fries", true, 530, Dish.Type.OTHER),
        new Dish("rice", true, 350, Dish.Type.OTHER),
        new Dish("season fruit", true, 120, Dish.Type.OTHER),
        new Dish("pizza", false, 550, Dish.Type.OTHER),
        new Dish("prawns", false, 300, Dish.Type.FISH),
        new Dish("salmon", false, 450, Dish.Type.FISH),
        new Dish("hamburger",false,1000,Dish.Type.MEAT)
    );

    public static void main(String[] args) {
        List<String> threeHighCaloricDishNames = 
        menu.stream()
            .filter(d -> d.getCalories() > 300)
            .map(Dish::getName)
            .limit(3)
            .collect(toList());
        System.out.println("Three most caloric dishes in the menu: " + threeHighCaloricDishNames);
    
    
        //create a list with the first 2 meats in the menu
        List<Dish> firstTwoMeats = menu.stream()
                                       .filter(i -> i.getType() == Dish.Type.MEAT)
                                       .limit(2)
                                       .collect(toList());
        System.out.println("First two meat dishes of the menu: " + firstTwoMeats);

        //get a list with all the vegetarian calories of the menu
        List<Integer> listOfVegetarianCalories = menu.stream()
                                                     .filter(i -> i.isVegetarian())
                                                     .map(Dish::getCalories)
                                                     .collect(toList());
        System.out.println("List of vegetarian calories in the menu: " + listOfVegetarianCalories);

        //get the total amount of calories of all the elements in the menu, added together
        Integer totalMenuCalories = menu.stream()
                                        .map(Dish::getCalories)
                                        .reduce(0, (accum,v)-> accum+v);
        System.out.println("Total menu calories: " + totalMenuCalories);
        
        //return the name of the most caloric element of the menu 
        Optional<Dish> maxcal = menu.stream()
                                    .max(Comparator.comparing(Dish::getCalories));
        if(maxcal.isPresent())
            System.out.println("Most caloric dish: " + maxcal.get().getName());

        //return the name of the least caloric element of the menu
        Optional<Dish> mincal = menu.stream()
                                    .min(Comparator.comparing(Dish::getCalories));
        if(mincal.isPresent())
            System.out.println("Least caloric dish: " + mincal.get().getName());

        //list of all the names of the dishes in the menu
        List<String> listOfDishNames = menu.stream()
                                           .map(Dish::getName)
                                           .collect(toList());
        System.out.println("All the names of the dishes in the menu: "+ listOfDishNames);  
          
        //list of all the lenght of the names of the dishes in the menu
        List<Integer> wordLenghts = menu.stream()
                                        .map(Dish::getName)
                                        .map(String::length)
                                        .collect(toList());
        System.out.println("List of all the word lenghts of the dishes of the menu: " + wordLenghts);

        //lenght of the most verbosely worded dish of the menu and its name
        Integer longest = menu.stream()
                              .map(Dish::getName)
                              .max(Comparator.comparing(String::length))
                              .get()
                              .length();
        String longestName = menu.stream()
                                 .max(Comparator.comparing(Dish::getCalories))
                                 .get()
                                 .getName();
        System.out.println("The longest word in the menu is " + longestName + ", with " + longest + " letters");

        
    }


}