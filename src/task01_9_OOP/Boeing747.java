package task01_9_OOP;

/**
 * Created by 111 on 14.05.2016.
 */
public class Boeing747 extends Aircraft {
    private final static String name="Boeing 747";
    public Boeing747(int numPas, float capacity, float distance, float consumption) {
        super(name, numPas, capacity, distance, consumption);
    }
}
