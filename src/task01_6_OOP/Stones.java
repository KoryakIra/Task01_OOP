package task01_6_OOP;

/**
 * Created by koryak on 12.05.2016.
 */
public class Stones {
    private final String name;
    private final float weightCarats;
    private final float hardness;
    private final float price;
    private final float density;
    private final String color;

    public Stones(String name, float weightCarats, float hardness, float price, float density, String color) {
        this.name = name;
        this.weightCarats = weightCarats;
        this.hardness = hardness;
        this.price = price;
        this.density = density;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public float getWeightCarats() {
        return weightCarats;
    }

    public float getHardness() {
        return hardness;
    }

    public float getPrice() {
        return price;
    }

    public float getDensity() {
        return density;
    }
    public String getColor() {
        return color;
    }
    public void stonesDensity(float den1,float den2){
        if (this.getDensity()>den1&&this.getDensity()<den2){
            System.out.println(getName()+" - "+getDensity()+" гр/см3");
            System.out.println();
        }

    }
}
