package task01_3_OOP;

/**
 * Created by 111 on 06.05.2016.
 */
public class Hairdryer extends ElectricalAppliance {
    private  final static String name="Фен";
    public Hairdryer(int power, String color, float weight, boolean switchStatus) {
        super(name, power, color, weight, switchStatus);
    }
}
