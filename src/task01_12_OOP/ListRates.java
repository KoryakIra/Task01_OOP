package task01_12_OOP;

import java.util.ArrayList;

/**
 * Created by koryak on 17.05.2016.
 */
public class ListRates {
    private int clientNum;
    private java.util.List<Rates> rates=new ArrayList<Rates>();

    public int getClientNum() {
        return clientNum;
    }
    public void addNum(Rates r){
        rates.add(r);
        clientNum+=r.getClientNum();
    }
}
