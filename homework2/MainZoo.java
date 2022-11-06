package homework2;

/**
 * Java Prof. Homework #2
 *
 * @author Liudmyla Zhlobinska
 * @version 04.11 - 06.11
 */
public class MainZoo {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "red", 3);
        Dog dog = new Dog("Sharik", "blac", 5);

        Cat emptyCat = new Cat();

        cat.voice();
        dog.voice();
        System.out.println(cat);
        System.out.println(dog);

        System.out.println(add(2, 2));
        System.out.println(add(-5.3, 2));
        System.out.println(add("123", "567"));

    }

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static String add(String a, String b) {
        return a + b;
    }
}
