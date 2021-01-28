package decoratordesignpattern;

/**
 * The Compact class is a child class of Vehicle that sets a description and has a method that returns its cost
 * @author Rachael
 */
public class Compact extends Vehicle {

    /**
     * constructor method that sets the description to "Compact"
     */
    public Compact() {
        this.description = "Compact";
    }

    /**
     * method that returns the cost of the Compact car
     * @return double cost of the compact car
     */
    public double getCost() {
        return 15000;
    }
}
