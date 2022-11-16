package patterns.creational.builder;

import patterns.creational.builder.builders.CarBuilder;
import patterns.creational.builder.builders.CarManualBuilder;
import patterns.creational.builder.cars.Car;
import patterns.creational.builder.cars.Manual;
import patterns.creational.builder.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();

        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
