package task01_8_OOP;

/**
 * Created by koryak on 13.05.2016.
 */
public class Plackart extends RollingStock {
    private final static String type ="Плацкартный";
    public Plackart(int numComfort, String comfort, int numPas, int numBag) {
        super(type, numComfort, comfort, numPas, numBag);
    }
}
