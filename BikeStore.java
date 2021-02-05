/**
 * BikeStore, a Storefront for Bikes
 * @author Brooks Robinson
 */
public class BikeStore {

    /**
     * Orders a Bike depending on the type ordered
     * @param type type of Bike ordered
     * @return Bike that was ordered
     */
    public Bike orderBike(String type) {

        return createBike(type);

    }

    /**
     * Builds the type of Bike requested
     * @param type type of Bike ordered
     * @return fully constructed Bike
     */
    private Bike createBike(String type) {

        Bike bike;

        if (type.equals("tricycle")) {
            bike = new Tricycle();
        } else if (type.equals("strider")) {
            bike = new Strider();
        } else {
            bike = new KidsBike();
        }

        bike.createBike();

        return bike;
    }

}