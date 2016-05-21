package task01_12_OOP;

/**
 * Created by koryak on 17.05.2016.
 */
public class Sun extends Rates {
    private static final String name="Солнечный";
    public Sun(int clientNum, float monthlyFee, int freeMinutes) {
        super(name, clientNum, monthlyFee, freeMinutes);
    }
}
