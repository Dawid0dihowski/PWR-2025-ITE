package pl.edu.pwr.dkocyla.jp.pojazdy;

public class Motorcycle extends Vehicle {

    public Motorcycle(String name, double tankCapacity) {
        super(name, tankCapacity);
    }

    @Override
    public double getFuelConsumption() {
        return 4.5 / 100;
    }
}