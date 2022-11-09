package patterns.creational.factorymethod.animals;

/**
 * @author Taewoo
 */

public class Rabbit implements Animal {

    @Override
    public void move() {
        System.out.println("[Move] Rabbit !!");
        onmove();
    }

    @Override
    public void onmove() {
        System.out.println("[OnMove] Rabbit !!");
    }
}
