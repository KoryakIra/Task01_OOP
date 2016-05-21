package task01_6_OOP;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by koryak on 12.05.2016.
 */
public class Necklace {
    private float price;
    private float weightCarats;
    private List<Stones> stones=new ArrayList<Stones>();

    public float getPrice() {
        return price;
    }

    public float getWeightCarats() {
        return weightCarats;
    }

    public void  addStones(Stones st){
        stones.add(st);
        price+=st.getPrice();
        weightCarats+=st.getWeightCarats();

    }
}
