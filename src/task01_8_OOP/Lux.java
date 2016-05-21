package task01_8_OOP;

/**
 * Created by koryak on 13.05.2016.
 */
public class Lux extends RollingStock {
    private final static String type="Люкс";
    public Lux(int numComfort, String comfort, int numPas, int numBag) {
        super(type, numComfort, comfort, numPas, numBag);
    }
}
