package task01_6_OOP;

/**
 * Created by koryak on 12.05.2016.
 */
public class Emerald extends Stones {
    private final static String name="Изумруд";
    public Emerald(float weightCarats, float hardness, float price, float density, String color) {
        super(name, weightCarats, hardness, price, density, color);
    }
}
