package decoratordesignpattern;

/**
 * Class that adds on a sound system to a description and cost of a vehicle
 * @author Rachael
 */
public class SoundSystem extends VehicleDecorator {

    private Vehicle vehicle; //Vehicle that the class is modifying

    /**
     * Sets the vehicle in the class to the vehicle that is being taken in from the parameter
     * @param vehicle the vehicle that the class will decorate
     */
    public SoundSystem(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    /**
     * returns the updated description of the vehicle
     * @return String with the vehicle's toString and "awesome sound"
     */
    public String toString() {
        return vehicle.toString() + ", awesome sound";
    }

    /**
     * method returns the updated cost of the vehicle
     * @return the cost of the vehicle plus additional 350 for the sound system
     */
    public double getCost() {
        return vehicle.getCost() + 350;
    }
    
}