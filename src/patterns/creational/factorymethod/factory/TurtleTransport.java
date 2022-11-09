package patterns.creational.factorymethod.factory;

import patterns.creational.factorymethod.animals.Animal;
import patterns.creational.factorymethod.animals.Turtle;

/**
 * @author Taewoo
 */


public class TurtleTransport extends Transport {

    @Override
    public Animal createAnimal() {
        return new Turtle();
    }
}
