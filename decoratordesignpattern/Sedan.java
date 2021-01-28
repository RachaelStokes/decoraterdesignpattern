package decoratordesignpattern;

/**
 * The sedan class is a child class of Vehicle that sets a description and has a method that returns its cost
 * @author Rachael
 */
public class Sedan extends Vehicle{

    /**
     * constructor method that sets the description to "Sedan"
     */
    public Sedan() {
        this.description = "Sedan";
    }

    /**
     * method that returns the cost of the sedan
     * @return double cost of the sedan
     */
    public double getCost() {
        return 20000;
    }
}
