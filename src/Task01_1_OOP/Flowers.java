package Task01_1_OOP;

/**
 * Created by 111 on 04.05.2016.
 */
public class Flowers {
    private final String name;
    private final float price;
    private final String color;
    private final int hour;
    private  final int length;

    public Flowers(String name, float price, String color, int hour, int length) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.hour = hour;
        this.length = length;
    }

    public String getName() {

        return name;
    }

    public float getPrice() {

        return price;
    }

    public String getColor() {
        return color;
    }

    public int getHour() {
        return hour;
    }

    public int getLength() {
        return length;
    }
public void flowerLength(int more,int less){
    if(this.getLength()>less&&this.getLength()<more){
        System.out.println(getName()+" с длиной стебля "+getLength()+" см");
    }

}
    }

