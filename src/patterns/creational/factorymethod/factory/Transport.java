package patterns.creational.factorymethod.factory;

import patterns.creational.factorymethod.animals.Animal;

/**
 * @author Taewoo
 */

public abstract class Transport {

    public void onmoveAnimal() {
        Animal animal = createAnimal();
        animal.move();
    }

    public abstract Animal createAnimal();
}
