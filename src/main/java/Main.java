public class Main {
    public static void main(String[] args) {

        SingletonPattern singleton1 = SingletonPattern.getInstance();
        singleton1.getDBConnection();

        SingletonPattern singleton2 = SingletonPattern.getInstance();
        singleton2.getDBConnection();

        System.out.println(singleton1==singleton2);
    }
}
