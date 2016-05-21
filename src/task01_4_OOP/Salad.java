package task01_4_OOP;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 111 on 05.05.2016.
 */
public class Salad {
    private int calorificValue;
    private List<Vegetables> vegetables=new ArrayList<Vegetables>();

    public int getCalorificValue() {
        return calorificValue;
    }
    public void addVegetables(Vegetables veg){
        vegetables.add(veg);
        calorificValue+=veg.getCalorificValue();
    }
}
