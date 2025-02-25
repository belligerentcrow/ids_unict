public class SingletonMain {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Singleton single = Singleton.getInstance("FOO");
        Singleton anotherSing = Singleton.getInstance("BOO");
        System.out.println(single.getValue());
        System.out.println(anotherSing.getValue());

        Singleton singsle = Singleton.getInstance("Hey");
        System.out.println(singsle.getValue());
        }
}
