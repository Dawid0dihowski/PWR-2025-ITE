package pl.edu.pwr.dkocyla.jp.pojazdy;

public abstract class Vehicle implements Refuelable, FuelConsuming {

    private String name;
    private double fuel;
    private double tankCapacity;

    public Vehicle(String name, double tankCapacity){
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.fuel = 0;


    }
    public String getName() {
        return name;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public abstract  double getFuelConsumption();

    @Override
    public void  refuel(double amount){
        fuel = fuel + amount;
        if (fuel > tankCapacity){
            fuel = tankCapacity;
        }
    }

    @Override
    public void consumeFuel(double distance) {
        double usedFuel = distance * getFuelConsumption();

        fuel = fuel - usedFuel;

        if (fuel < 0) {
            fuel = 0;
        }
    }

    public void show() {
        System.out.println(
                name +
                        " | paliwo: " + fuel + " l" +
                        " | spalanie: " + getFuelConsumption() * 100 + " l/100 km"
        );
    }
}
