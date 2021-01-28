package decoratordesignpattern;

/**
 * 
 * @author Rachael
 */
public class Paint extends VehicleDecorator {

    private Vehicle vehicle;

    public Paint(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public String toString() {
        return vehicle.toString() + "fancy paint";
    }

    public double getCost() {
        return vehicle.getCost() + 150;
    }
    
}
