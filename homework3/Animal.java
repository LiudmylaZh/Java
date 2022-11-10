package homework3;

public class Animal implements IAnimal {
    protected int runLimit;
    protected int swimLimit;

    public Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    @Override
    public void run(int d) {
        if (d <= runLimit) {
            System.out.println("Can run " + d + "m");

        } else {
            System.out.println("Can not run " + d + "m");
        }
    }

    @Override
    public void swim(int d) {
        if (d <= swimLimit) {
            System.out.println("Can swim " + d + "m");

        } else {
            System.out.println("Can not swim " + d + "m");
        }
    }
}
