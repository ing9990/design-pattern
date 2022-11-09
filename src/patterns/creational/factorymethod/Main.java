package patterns.creational.factorymethod;

import patterns.creational.factorymethod.factory.RabbitTransport;
import patterns.creational.factorymethod.factory.Transport;
import patterns.creational.factorymethod.factory.TurtleTransport;

/**
 * @author Taewoo
 */


public class Main {
    static final String favoriteAniaml = "Rabbit";
    // static final String favoriteAniaml = "Turtle";

    private static Transport transport;

    public static void main(String[] args) {
        configure();
        runLogic();
    }

    static void configure() {
        transport = favoriteAniaml.equals("Rabbit") ?
                new RabbitTransport() : new TurtleTransport();
    }

    static void runLogic() {
        transport.onmoveAnimal();
    }
}
