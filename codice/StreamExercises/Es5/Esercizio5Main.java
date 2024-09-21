package StreamExercises.Es5;

public class Esercizio5Main {
    private static Esercizio5 e5 = new Esercizio5();
    private static Esercizio5_2 e5_2 = new Esercizio5_2();

    public static void main(String[] args) {
        // System.out.println(e5.checkList(1));
        e5_2.init();
        System.out.println("-----------");
        e5_2.printlist(e5_2.getList(1));
        System.out.println(e5_2.checkList(e5_2.getList(1)));
        System.out.println("-----------");
        e5_2.printlist(e5_2.getList(2));
        System.out.println(e5_2.checkList(e5_2.getList(2)));
        System.out.println("-----------");
        e5_2.printlist(e5_2.getList(3));
        System.out.println(e5_2.checkList(e5_2.getList(3)));
    }
}
