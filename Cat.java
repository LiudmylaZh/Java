/**
 * Java Prof. Homework #1
 *
 * @author Liudmyla Zhlobinska
 * @version 31.10 - 01.11
 */
public class Cat {
    private String name;
    private String color;
    private String age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = String.valueOf(age);
    }

    public void voice() {
        System.out.println("meow");
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + name + '\'' + ", color='" + color + '\'' + ", age='" + age + '\'' + '}';
    }

    /**
     * Java Prof. Homework #1
     *
     * @author Liudmyla Zhlobinska
     * @version 31.10 - 01.11
     */
    public static class HelloCat {
        public static void main(String[] args) {
            Cat cat = new Cat("Barsik", "red", 4);
            cat.voice();
            System.out.println(cat);
        }
    }
}
