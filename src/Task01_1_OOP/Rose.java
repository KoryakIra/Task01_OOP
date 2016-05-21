package Task01_1_OOP;

/**
 * Created by 111 on 04.05.2016.
 */
public class Rose extends Flowers {
    private final static String name="Роза";
    public Rose(float price, String color, int hour,int length) {
        super(name, price, color, hour, length);
    }
}
