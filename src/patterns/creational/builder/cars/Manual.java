package patterns.creational.builder.cars;

import patterns.creational.builder.components.Engine;
import patterns.creational.builder.components.GPSNavigator;
import patterns.creational.builder.components.Transmission;
import patterns.creational.builder.components.TripComputer;

public class Manual {

    private static final StringBuilder info = new StringBuilder("");

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public static void resetInfo() {
        info.setLength(0);
    }

    public String print() {

        resetInfo();

        info
                .append("Type of car: ")
                .append(carType)
                .append("\n")
                .append("Count of seats: ")
                .append(seats).append("\n")
                .append("Engine: volume - ")
                .append(engine.getVolume())
                .append("mileage - ")
                .append(engine.getMileage())
                .append("\n")
                .append("Transmission: ")
                .append(transmission)
                .append("\n");

        if (this.tripComputer != null) {
            info.append("Trip Computer: Functional" + "\n");
        } else {
            info.append("Trip Computer: N/A" + "\n");
        }
        if (this.gpsNavigator != null) {
            info.append("GPS Navigator: Functional" + "\n");
        } else {
            info.append("GPS Navigator: N/A" + "\n");
        }
        return info.toString();
    }
}