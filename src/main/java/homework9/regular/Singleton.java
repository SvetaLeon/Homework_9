package homework9.regular;

public class Singleton {
    private static Singleton instance;
    public String name;

    private Singleton(String name) {
        this.name = name;
    }

    public static Singleton getInstance(String name) {
        if (instance == null) {
            instance = new Singleton(name);
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton person1 = Singleton.getInstance("Tom");
        System.out.println(person1.name);

        Singleton person2 = Singleton.getInstance("Bob");
        System.out.println(person2.name);

        System.out.println(person1.equals(person2));
    }
}
