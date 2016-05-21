package task01_4_OOP;

/**
 * Created by 111 on 05.05.2016.
 */
public class Vegetables {
    private final String name;
    private final  int weight;
    private final float cellulose;
    private final int calorificValue;

    public Vegetables(String name, int weight,float cellulose, int calorificValue) {
        this.name = name;
        this.weight = weight;
        this.cellulose = cellulose;
        this.calorificValue = calorificValue;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public float getCellulose() {
        return cellulose;
    }

    public int getCalorificValue() {
        return calorificValue;
    }
    public void CalorificVegetables(int more,int less){
        if (this.getCalorificValue()>less&&this.getCalorificValue()<more){
            System.out.println(getName()+" содержит "+getCalorificValue()+" ккал");
        }
    }
}
