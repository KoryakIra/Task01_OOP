package task01_9_OOP;

/**
 * Created by 111 on 14.05.2016.
 */
public class Boeing737 extends Aircraft {
    private static final String name="Boeing 737-900";
    public Boeing737(int numPas, float capacity, float distance, float consumption) {
        super(name, numPas, capacity, distance, consumption);
    }
}
