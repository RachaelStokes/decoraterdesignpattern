package decoratordesignpattern;

/**
 * 
 * @author Rachael
 */
public class SoundSystem extends VehicleDecorator {

    private Vehicle vehicle;

    public SoundSystem(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public String toString() {
        return vehicle.toString() + "awesome sound";
    }

    public double getCost() {
        return vehicle.getCost() + 350;
    }
    
}