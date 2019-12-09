
package assignment5;

/**
 *
 * @author Aufrichtig1
 */
public class Vehicle {

    protected static final int ERROR = 100;
    private String make;
    private int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Vehicle " + make + " " + year;
    }

    public int compareTo(Object other) {
        if (other instanceof Vehicle) {
            if (Integer.compare(year, ((Vehicle) other).year) == -1) {
                return 1;
            } else if (Integer.compare(year, ((Vehicle) other).year) == 1) {
                return -1;
            }
            else return 0;
            

        } else {
            return ERROR;
        }
    }
}
