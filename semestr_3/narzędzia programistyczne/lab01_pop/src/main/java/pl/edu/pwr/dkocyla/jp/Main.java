package pl.edu.pwr.dkocyla.jp;
import pl.edu.pwr.dkocyla.jp.pojazdy.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("BMW",50));
        vehicles.add(new Motorcycle("yamaha",20));
        vehicles.add(new Truck("Scania",200));

        for (Vehicle vehicle : vehicles) {
            vehicle.refuel(vehicle.getTankCapacity() / 2) ;
        }

        for(int i = 0; i < 10; i++){
            int index = random.nextInt(vehicles.size());
            Vehicle randomVehicle = vehicles.get(index);
            boolean refuel = random.nextBoolean();


            if(refuel){
                int amount = random.nextInt(5, 11);
                randomVehicle.refuel(amount);
                System.out.println(randomVehicle.getName() + " zatankowano " + amount + " l");
            }
            else {
                int distance = random.nextInt(10,101);
                randomVehicle.consumeFuel(distance);
                System.out.println(randomVehicle.getName() + " przejechał " + distance + " km i spalił "+ randomVehicle.getFuelConsumption() * distance + "l");
            }
        }

        for (Vehicle vehicle : vehicles) {
            vehicle.show();
        }
    }
}
