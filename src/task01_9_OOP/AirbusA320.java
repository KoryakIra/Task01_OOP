package task01_9_OOP;

/**
 * Created by 111 on 14.05.2016.
 */
public class AirbusA320 extends Aircraft{
    private static final String name="Airbus A320-200";
    public AirbusA320(int numPas, float capacity, float distance, float consumption) {
        super(name, numPas, capacity, distance, consumption);
    }
}
