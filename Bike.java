public abstract class Bike {
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    public void createBike() {
        createFrame();
        addWheels();
        addPedals();
        System.out.println("Price: $" + getPrice());
    }

    private void createFrame() {
        System.out.println("Assembling " + name + " frame");
    }

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

    private void addPedals() {
        if (hasPedals) {
            System.out.println("Adding pedals");
        }
    }

    public double getPrice() {
        return price;
    }
}
