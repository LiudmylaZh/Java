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
}
