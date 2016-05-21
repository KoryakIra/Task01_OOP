package task01_9_OOP;

/**
 * Created by 111 on 14.05.2016.
 */
public class Aircraft {
    private final String name;
    private final int numPas;
    private final float capacity;
    private final float distance;
    private final float consumption;
    static int k=0;

    public Aircraft(String name, int numPas, float capacity, float distance, float consumption) {
        this.name = name;
        this.numPas = numPas;
        this.capacity = capacity;
        this.distance = distance;
        this.consumption = consumption;
    }

    public String getName() {
        return name;
    }

    public int getNumPas() {
        return numPas;
    }

    public float getCapacity() {
        return capacity;
    }

    public float getDistance() {
        return distance;
    }

    public float getConsumption() {
        return consumption;
    }
    public  void airCapacity(float d1,float d2){
        if (this.getConsumption()<d2&&this.getConsumption()>d1){
        System.out.print((++k)+". ");
        System.out.print(getName()+", ");
            System.out.println(getConsumption()+" л");
    }
}
}
