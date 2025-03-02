package Traders;

public class Transaction {
    private final Trader trader;
    private final int year;
    private final int value;

    public Transaction(Trader tr, int y, int val){
        this.trader = tr;
        this.year = y;
        this.value = val; 
    }

    public Trader getTrader() {
        return trader;
    }
    public int getValue() {
        return value;
    }
    public int getYear() {
        return year;
    }

    public String toString(){
        return "{"+ this.trader + ", Year: " + this.year + ", value: " +this.value + "}";
    }
}
