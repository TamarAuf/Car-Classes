
package assignment5;

import java.util.ArrayList;

/**
 *
 * @author Aufrichtig1
 */
public class Assignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        
        vehicles.add(new SportsCar(113, "Mazda", 2019));
        vehicles.add(new SportsCar(225, "Jaguar", 2011));
        vehicles.add(new Truck(14, "Dump", 2005));
        vehicles.add(new Truck(35, "Garbage", 1990));
        vehicles.add(new Vehicle("Bicycle", 1990));

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

        for (int i = 0; i < vehicles.size(); i++) {
            for (int j = i + 1; j < vehicles.size(); j++) {
                int comparison = vehicles.get(i).compareTo(vehicles.get(j));
                if (comparison == 1) {
                    System.out.println(vehicles.get(i) + " > " + vehicles.get(j));
                }
                if (comparison == 0) {
                    System.out.println(vehicles.get(i) + " = " + vehicles.get(j));
                }
                if (comparison == -1) {
                    System.out.println(vehicles.get(i) + " < " + vehicles.get(j));
                }
            }
        }

    }

}
