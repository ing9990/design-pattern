package patterns.creational.builder.components;

public class Engine {

    private final double volume;

    private double mileage;

    private EngineStatus status;

    public enum EngineStatus {
        START, STOP
    }

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on() {
        status = EngineStatus.START;
    }

    public void off() {
        status = EngineStatus.STOP;
    }

    public boolean isStarted() {
        return status == EngineStatus.START;
    }

    public void go(double mileage) {
        if (isStarted()) {
            this.mileage += mileage;
        } else {
            System.out.println("Cannot go(), you must start engine first!");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }

}
