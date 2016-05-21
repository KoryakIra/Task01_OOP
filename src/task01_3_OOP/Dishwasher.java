package task01_3_OOP;

/**
 * Created by 111 on 06.05.2016.
 */
public class Dishwasher extends ElectricalAppliance {
    private final static String name="Посудомоечная машина";
    public Dishwasher(int power, String color, float weight, boolean switchStatus) {
        super(name, power, color, weight, switchStatus);
    }
}
