package task01_12_OOP;

/**
 * Created by koryak on 17.05.2016.
 */
public class Evening extends Rates {
    private static final String name="Вечерний";
    public Evening(int clientNum, float monthlyFee, int freeMinutes) {
        super(name, clientNum, monthlyFee, freeMinutes);
    }
}
