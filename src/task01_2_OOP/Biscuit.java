package task01_2_OOP;

/**
 * Created by 111 on 05.05.2016.
 */
public class Biscuit extends Sweets {
    private final static String name="Печенье";
    public Biscuit(int weight, float price, int sugarContent) {
        super(name, weight, price, sugarContent);
    }
}
