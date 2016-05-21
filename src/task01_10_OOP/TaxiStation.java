package task01_10_OOP;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by koryak on 17.05.2016.
 */
public class TaxiStation {
    private float costs;
    private List<Car> cars=new ArrayList<Car>();

    public float getCosts() {
        return costs;
    }
    public void addCar(Car c){
        cars.add(c);
        costs+=c.getCost();
    }

}
