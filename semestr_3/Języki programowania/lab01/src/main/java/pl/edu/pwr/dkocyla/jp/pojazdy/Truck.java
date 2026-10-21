package pl.edu.pwr.dkocyla.jp.pojazdy;

public class Truck extends Vehicle {

    public Truck(String name, double tankCapacity) {
        super(name, tankCapacity);
    }

    @Override
    public double getFuelConsumption() {
        return 25.0 / 100;
    }
}