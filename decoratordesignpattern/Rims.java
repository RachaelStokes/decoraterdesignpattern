package decoratordesignpattern;

/**
 * 
 * @author Rachael
 */
public class Rims extends VehicleDecorator {

    private Vehicle vehicle;

    public Rims(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public String toString() {
        return vehicle.toString() + ", cool rims";
    }

    public double getCost() {
        return vehicle.getCost() + 200;
    }
    
}