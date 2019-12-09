
package assignment5;

/**
 *
 * @author Aufrichtig1
 */
public class SportsCar extends Vehicle implements Comparable {

    int maxMPH;

    public SportsCar(int maxMPH, String make, int year) {
        super(make, year);
        this.maxMPH = maxMPH;
    }

    public int getMaxMPH() {
        return maxMPH;
    }

    public void setMaxMPH(int maxMPH) {
        this.maxMPH = maxMPH;
    }

    public String toString() {
        return "Sports Car " + getMake() + " " + getYear() + " " + maxMPH + "mph";
    }

    public int compareTo(Object other) {
        if (other instanceof SportsCar) {
            return Integer.compare(maxMPH, ((SportsCar) other).maxMPH);
        } else {
            return Integer.compare(getYear(), ((Vehicle) other).getYear());
        }

    }
}
