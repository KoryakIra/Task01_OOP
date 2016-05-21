package task01_9_OOP;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 111 on 14.05.2016.
 */
public class MyCompany {
    private int numPas;
    private float capacity;
    private List<Aircraft> aircrafts=new ArrayList<Aircraft>();

    public int getNumPas() {
        return numPas;
    }

    public float getCapacity() {
        return capacity;
    }
    public void addAir(Aircraft air){
        aircrafts.add(air);
        numPas+=air.getNumPas();
        capacity+=air.getCapacity();
    }
}
