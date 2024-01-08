package homework9.threadSafe;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    public int age;

    private ThreadSafeSingleton(int age) {
        this.age = age;
    }

    public static synchronized ThreadSafeSingleton getInstance(int age) {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton(age);
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        ThreadSafeSingleton person1 = ThreadSafeSingleton.getInstance(23);
        System.out.println(person1.age);

        ThreadSafeSingleton person2 = ThreadSafeSingleton.getInstance(45);
        System.out.println(person2.age);

        System.out.println(person1.equals(person2));
    }
}
