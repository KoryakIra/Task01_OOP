package task01_11_OOP;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by koryak on 18.05.2016.
 */
public class Derivative {
    private float sum;
    private List<Insurance> insurances=new ArrayList<Insurance>();

    public float getSum() {
        return sum;
    }
public void addInsurance(Insurance in){
    insurances.add(in);
    sum+=in.getSum();
}

}
