package task01_3_OOP;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 111 on 06.05.2016.
 */
public class ElectricalNetwork {
    private int power;
    private List<ElectricalAppliance> electricalAppliances=new ArrayList<ElectricalAppliance>();

    public int getPower() {
        return power;
    }

    public void addElectricalAppliance(ElectricalAppliance ea){
        electricalAppliances.add(ea);
       power+=ea.getPower();
    }
}

