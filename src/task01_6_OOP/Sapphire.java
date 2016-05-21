package task01_6_OOP;

/**
 * Created by koryak on 12.05.2016.
 */
public class Sapphire extends Stones {
    private final static String name="Сапфир";
    public Sapphire(float weightCarats, float hardness, float price, float density, String color) {
        super(name, weightCarats, hardness, price,  density, color);
    }
}
