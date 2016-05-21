package task01_10_OOP;

/**
 * Created by koryak on 17.05.2016.
 */
public class Lada extends Car {
    private static final String name="Лада 99";
    public Lada(float cost, float fuelConsumption, float speed) {
        super(name, cost, fuelConsumption, speed);
    }
}
