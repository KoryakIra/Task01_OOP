package Task01_1_OOP;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 111 on 05.05.2016.
 */
public class Bouquet  {
    private float price;
    private List<Flowers> flowers = new ArrayList<Flowers>();
    private List<Accessories> accessories=new ArrayList<Accessories>();
    public float getPrice() {
        return price;
    }
public void addFlowers(Flowers fl) {
    flowers.add(fl);
    price+=fl.getPrice();
}
public void addAccessories(Accessories acc){
    accessories.add(acc);
    price+=acc.getPrice();
}
}
