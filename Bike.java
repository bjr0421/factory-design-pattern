/**
 * Bike, a object created for BikeStore
 * @author Brooks Robinson
 */
public abstract class Bike {

    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    /**
     * Constructor for a Bike object
     */
    public void createBike() {
        createFrame();
        addWheels();
        addPedals();
        System.out.println("Price: $" + getPrice());
    }

    /**
     * Creates the frame of the bicycle
     */
    private void createFrame() {
        System.out.println("Assembling " + name + " frame");
    }

    /**
     * Adds the wheels onto the frame of the bicycle if requested
     */
    private void addWheels() {
        if (numWheels < 1) {
            return;
        } else {
            System.out.println("Adding " + numWheels + " wheel(s)");
        }

        if (hasTrainingWheels) {
            System.out.println("Adding training wheels");
        }
    }

    /**
     * Adds pedals onto the frame of the bicycle if requested
     */
    private void addPedals() {
        if (hasPedals) {
            System.out.println("Adding pedals");
        }
    }

    /**
     * Gets the price of the bicycle depending on the type
     * @return price of the bicycle
     */
    public double getPrice() {
        return price;
    }
}
