package homework3;

/**
 * Java Prof. Homework #3
 *
 * @author Liudmyla Zhlobinska
 * @version 07.11 - 10.11
 */
public class Homework3 {
    public static void main(String[] args) {
        Cat cat = new Cat(200);
        Dog dog = new Dog(500, 10);
        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            animal.run(500);
            animal.run(200);
            animal.swim(8);
            animal.swim(12);
        }
    }
}
