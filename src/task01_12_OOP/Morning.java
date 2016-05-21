package task01_12_OOP;

/**
 * Created by koryak on 17.05.2016.
 */
public class Morning extends Rates {
    private final static String name="Утренний";
    public Morning(int clientNum, float monthlyFee, int freeMinutes) {
        super(name, clientNum, monthlyFee, freeMinutes);
    }
}
