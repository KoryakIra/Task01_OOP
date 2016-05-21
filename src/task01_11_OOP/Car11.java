package task01_11_OOP;

/**
 * Created by koryak on 18.05.2016.
 */
public class Car11 extends Insurance {
    private static final String name="Страхование автомобиля";
    public Car11(float sum, float risk, float insuranceMoney) {
        super(name, sum, risk, insuranceMoney);
    }
}
