package pl.edu.pwr.dkocyla.jp.pojazdy;

public class Car extends Vehicle {

    public Car(String name, double tankCapacity) {
        super(name, tankCapacity);
    }

    @Override
    public double getFuelConsumption() {
        return 7.5 / 100;
    }
}