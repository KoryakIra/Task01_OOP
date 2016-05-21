package task01_8_OOP;

/**
 * Created by koryak on 13.05.2016.
 */
public class Coupe extends RollingStock {
    private static final String type = "Купейный";
    public Coupe(int numComfort, String comfort, int numPas, int numBag) {
        super(type, numComfort, comfort, numPas, numBag);
    }
}
