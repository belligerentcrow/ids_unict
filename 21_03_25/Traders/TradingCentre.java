package Traders;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TradingCentre {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011,300),
            new Transaction(raoul,2012,1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );

        //1 - Find all transactions in the year 2011 and sort them by value - Small to high
        List<Transaction> sol1 = transactions.stream()
                                             .filter(x-> x.getYear() == 2011)
                                             .sorted(Comparator.comparing(Transaction::getValue))
                                             .collect(Collectors.toList()); 
        System.out.println("Solution 1: " + sol1);

        //2 - What are all the unique cities where the traders work?
        List<String> sol2 = transactions.stream()
                                        .map(x -> x.getTrader().getCity())
                                        .distinct()
                                        .collect(Collectors.toList());
        System.out.println("Solutions 2: " + sol2);

        //3 - Find all traders from Cambridge and sort them by name. 
        List<Trader> sol3 = transactions.stream() 
                                        .filter(x -> x.getTrader().getCity() == "Cambridge")
                                        .map(x->x.getTrader())
                                        .distinct()
                                        .sorted(Comparator.comparing(Trader::getName))
                                        .collect(Collectors.toList());
        System.out.println("Solutions 3: " + sol3);

        //4 - Return a string of all traders' names sorted alphabetically
        String sol4 = transactions.stream()
                                  .map(x -> x.getTrader())
                                  .distinct()
                                  .sorted(Comparator.comparing(Trader::getName))
                                  .map(x->x.getName())
                                  .reduce("", (a,b) -> a+b);
        System.out.println("Solution 4: " + sol4);

        //5 - Are any traders based in Milan?
        Boolean sol5 = transactions.stream()
                                   .map(x -> x.getTrader())
                                   .distinct()
                                   .anyMatch(x -> x.getCity() == "Milan");
        System.out.println("Solution 5: " + sol5);

        //6 - Print all transactions values from traders living in Cambridge.
        List<Integer> sol6 = transactions.stream()
                                         .filter(x -> x.getTrader().getCity() == "Cambridge")
                                         .map(x -> x.getValue())
                                         .collect(Collectors.toList());
                                         //.gorEach(System.out::println); //would have also worked
        System.out.println("Solution 6: " + sol6);

        //7 - What's the highest value of all the transactions?
        Integer sol7 = transactions.stream()
                                   .max(Comparator.comparing(Transaction::getValue))
                                   .map(x->x.getValue())
                                   .get();
                                   //.reduce(Integer::max); //would have also worked
        System.out.println("Solution 7: " + sol7);

        //8 - Find the transaction with the smallest value.
        Transaction sol8 = transactions.stream()
                                       .min(Comparator.comparing(Transaction::getValue))
                                       .get();
        System.out.println("Solution 8: " + sol8);
    }
}
