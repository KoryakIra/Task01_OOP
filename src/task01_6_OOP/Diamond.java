package task01_6_OOP;

/**
 * Created by koryak on 12.05.2016.
 */
public class Diamond extends Stones {
    private final static String name="Бриллиант";
    public Diamond(float weightCarats, float hardness, float price, float density, String color) {
        super(name, weightCarats, hardness, price,  density, color);
    }
}
