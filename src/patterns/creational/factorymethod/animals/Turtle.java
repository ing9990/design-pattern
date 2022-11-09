package patterns.creational.factorymethod.animals;

/**
 * @author Taewoo
 */


public class Turtle implements Animal {

    @Override
    public void move() {
        System.out.println("[Move] Turtle !!");
        onmove();
    }

    @Override
    public void onmove() {
        System.out.println("[OnMove] Rabbit !!");
    }
}
