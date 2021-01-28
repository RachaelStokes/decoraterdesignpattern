package decoratordesignpattern;

/**
 * sports car class is a child of the vehicle class that sets a description and has a method that returns its cost
 * @author Rachael
 */
public class SportsCar extends Vehicle{

    /**
     * constructor method that sets the description to "Sports Car"
     */
    public SportsCar() {
        this.description = "Sports Car";
    }

    /**
     * method that returns the cost of the Sports Car
     * @return double cost of the Sports Car
     */
    public double getCost() {
        return 30000;
    }
    
}
