package decoratordesignpattern;

/**
 * Class that adds on rims to a description and cost of a vehicle
 * @author Rachael
 */
public class Rims extends VehicleDecorator {

    private Vehicle vehicle; //Vehicle that the class is modifying

    /**
     * Sets the vehicle in the class to the vehicle that is being taken in from the parameter
     * @param vehicle the vehicle that the class will decorate
     */
    public Rims(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    /**
     * returns the updated description of the vehicle
     * @return String with the vehicle's toString and "cool rims"
     */
    public String toString() {
        return vehicle.toString() + ", cool rims";
    }

    /**
     * method returns the updated cost of the vehicle
     * @return the cost of the vehicle plus additional 200 for rims
     */
    public double getCost() {
        return vehicle.getCost() + 200;
    }
    
}