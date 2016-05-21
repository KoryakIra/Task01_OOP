package task01_11_OOP;

/**
 * Created by koryak on 18.05.2016.
 */
public class Health extends Insurance {
    private static final String name="Страхование здоровья";
    public Health(float sum, float risk, float insuranceMoney) {
        super(name, sum, risk, insuranceMoney);
    }
}
