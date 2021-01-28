package decoratordesignpattern;

/**
 * abstract class vehicle that is used when creating more specific types of vehicles
 * @author Rachael
 */
public abstract class Vehicle {
    protected String description;

    /** 
     * method to return the description as a string
     * @return the string description
     */
    public String toString() {
        return description;
    }

    /**
     * abstract method that will return the double cost of the vehicle
     * @return the double cost if the vehicle
     */
    public abstract double getCost();
    
}
