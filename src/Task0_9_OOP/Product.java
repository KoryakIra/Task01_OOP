package Task0_9_OOP;

/**
 * Created by koryak on 28.04.2016.
 */
public class Product {
    private int id;
    private String name;
    private long ups;
    private String manufacturer;
    private float price;
    private int year;
    private int number;
    static int k=0,l=0,m=0;

    public Product() {
    }

    public Product(int id, String name, long ups, String manufacturer, float price, int year, int number) {
        this.id = id;
        this.name = name;
        this.ups = ups;
        this.manufacturer = manufacturer;
        this.price = price;
        this.year = year;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getUps() {
        return ups;
    }

    public void setUps(long ups) {
        this.ups = ups;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public void nameList(String n1){
        if (this.getName().equals(n1)){
            System.out.print((++k)+") ");
            System.out.println("ID "+getId()+" ");
            System.out.println("Наименование товара: "+getName()+" ");
            System.out.println("Производитель: "+getManufacturer()+" ");
            System.out.println("UPS: "+getUps()+" ");
            System.out.println("Цена за единицу: "+getPrice()+" у.е. ");
            System.out.println("Срок хранения: "+getYear()+" лет");
            System.out.println("Количество единиц товара: "+getNumber()+" шт. ");
            System.out.println("---------------------------------------------------");
    }
    }
    public void namePrice(String n1,float p){
        if (this.getName().equals(n1)&&this.getPrice()<=p){
            System.out.print((++l)+") ");
            System.out.println("ID "+getId()+" ");
            System.out.println("Наименование товара: "+getName()+" ");
            System.out.println("Производитель: "+getManufacturer()+" ");
            System.out.println("UPS: "+getUps()+" ");
            System.out.println("Цена за единицу: "+getPrice()+" у.е. ");
            System.out.println("Срок хранения: "+getYear()+" лет");
            System.out.println("Количество единиц товара: "+getNumber()+" шт. ");
            System.out.println("---------------------------------------------------");
        }
    }
    public void nameYear(int yr){
        if (this.getYear()>yr){
            System.out.print((++m)+") ");
            System.out.println("ID "+getId()+" ");
            System.out.println("Наименование товара: "+getName()+" ");
            System.out.println("Производитель: "+getManufacturer()+" ");
            System.out.println("UPS: "+getUps()+" ");
            System.out.println("Цена за единицу: "+getPrice()+" у.е. ");
            System.out.println("Срок хранения: "+getYear()+" лет");
            System.out.println("Количество единиц товара: "+getNumber()+" шт. ");
            System.out.println("---------------------------------------------------");
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ups=" + ups +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", number=" + number +
                '}';
    }
}
