package task01_2_OOP;

/**
 * Created by 111 on 05.05.2016.
 */
public class Sweets {
    private final String name;
    private final int weight;
    private final float price;
    private final int sugarContent;

    public Sweets(String name, int weight, float price, int sugarContent) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.sugarContent = sugarContent;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public float getPrice() {
        return price;
    }

    public int getSugarContent() {
        return sugarContent;
    }
    public void sugarCandies(int more,int less){
        if((this.getSugarContent()>less)&&(this.getSugarContent()<more)){
            System.out.println(getName()+" "+getSugarContent()+" процентов сахара");
        }
    }
}
