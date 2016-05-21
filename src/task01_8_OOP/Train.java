package task01_8_OOP;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by koryak on 13.05.2016.
 */
public class Train {
    private int numPas;
    private int numBag;
   private List<RollingStock> rollingStocks=new ArrayList<RollingStock>();

    public int getNumPas() {
        return numPas;
    }

    public int getNumBag() {
        return numBag;
    }
    public void addRollingStock(RollingStock rs){
        rollingStocks.add(rs);
        numPas+=rs.getNumPas();
        numBag+=rs.getNumBag();

    }
}
