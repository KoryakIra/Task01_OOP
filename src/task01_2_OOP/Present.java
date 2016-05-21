package task01_2_OOP;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 111 on 05.05.2016.
 */
public class Present {
    private int weight;
    private List<Sweets> sweetses=new ArrayList<Sweets>();

    public int getWeight() {
        return weight;
    }
    public void addSweets(Sweets sw){
        sweetses.add(sw);
        weight+=sw.getWeight();
    }
}
