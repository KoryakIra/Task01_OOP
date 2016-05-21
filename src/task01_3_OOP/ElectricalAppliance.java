package task01_3_OOP;

/**
 * Created by 111 on 06.05.2016.
 */
public class ElectricalAppliance {
    private final String name;
    private final int power;
    private final String color;
    private final float weight;
    private final boolean switchStatus;


    public ElectricalAppliance(String name, int power, String color, float weight, boolean switchStatus) {
        this.name = name;
        this.power = power;
        this.color = color;
        this.weight = weight;
        this.switchStatus = switchStatus;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public String getColor() {
        return color;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isSwitchStatus() {
        return switchStatus;
    }
    public void appWeight(float w1, float w2){
        if (this.getWeight()<w2&&this.getWeight()>w1){
            System.out.println(getName()+" цвет "+getColor()+" "+getWeight()+" кг");

    }
}}
