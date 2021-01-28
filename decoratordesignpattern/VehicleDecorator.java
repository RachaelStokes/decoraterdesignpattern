package decoratordesignpattern;

/**
 * abstract class VehicleDecorator is a child of the vehicle class forces classes that extends it to make a toString method
 * @author Rachael
 */
public abstract class VehicleDecorator extends Vehicle {
    
    /**
     * toString method that will return a string 
     * @return string
     */
    public abstract String toString();
}
