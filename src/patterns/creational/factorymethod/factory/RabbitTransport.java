package patterns.creational.factorymethod.factory;

import patterns.creational.factorymethod.animals.Animal;
import patterns.creational.factorymethod.animals.Rabbit;

/**
 * @author Taewoo
 */


public class RabbitTransport extends Transport {

    @Override
    public Animal createAnimal() {
        return new Rabbit();
    }
}
