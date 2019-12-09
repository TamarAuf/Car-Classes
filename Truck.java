
package assignment5;

/**
 *
 * @author Aufrichtig1
 */
public class Truck extends Vehicle implements Comparable {

    int cargoCapac;

    public Truck(int cargoCapac, String make, int year) {
        super(make, year);
        this.cargoCapac = cargoCapac;
    }

    public int getCargoCapac() {
        return cargoCapac;
    }

    public void setCargoCapac(int cargoCapac) {
        this.cargoCapac = cargoCapac;
    }

    public String toString() {
        return "Truck " + getMake() + " " + getYear() + " " + cargoCapac + "cubic yards";
    }

    public int compareTo(Object other) {
        if (other instanceof Truck) {
            return Integer.compare(cargoCapac, ((Truck) other).cargoCapac);
        } else {
            return Integer.compare(getYear(), ((Vehicle) other).getYear());
        }
    }
}
