package task01_10_OOP;

/**
 * Created by koryak on 17.05.2016.
 */
public class Car {
    private final String name;
    private final float cost;
    private final float fuelConsumption;
    private final float speed;
   static int k=0;

    public Car(String name, float cost, float fuelConsumption, float speed) {
        this.name = name;
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }
    public float getCost() {
        return cost;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public float getSpeed() {
        return speed;
    }
    public void carSpeed(float s1, float s2){
        if(this.getSpeed()<s1&&this.getSpeed()>s2){
            System.out.print((++k)+". ");
            System.out.print(getName()+", ");
            System.out.println(getSpeed()+" км/ч");
        }
    }
}
