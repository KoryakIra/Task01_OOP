package Task0_8_OOP;

/**
 * Created by koryak on 27.04.2016.
 */
public class Car {
    private int id;
    private String brandCar;
    private String model;
    private int year;
    private String color;
    private Float price;
    private int numberReg;
    static int k=0,l=0,m=0;
    public Car() {
    }

    public Car(int id, String brandCar, String model, int year, String color, Float price, int numberReg) {
        this.id = id;
        this.brandCar = brandCar;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.numberReg = numberReg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getNumberReg() {
        return numberReg;
    }

    public void setNumberReg(int numberReg) {
        this.numberReg = numberReg;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brandCar='" + brandCar + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", numberReg=" + numberReg +
                '}';
    }

    public void brand(String brC){
        if(this.getBrandCar().equals(brC)) {
            System.out.print((++k) + ") ");
            System.out.println("ID:" + getId());
            System.out.print("\""+getBrandCar()+"\", ");
            System.out.print("\""+getModel()+"\", ");
            System.out.print("год выпуска: "+getYear()+", ");
            System.out.println("цвет: \""+getColor()+"\". ");
            System.out.println("Регистрационный номер: "+getNumberReg()+".");
            System.out.println("Цена: "+getPrice()+"у.е.");
            System.out.println("------------------------------------------------------------");


        }

    }
    public void modelCar(String mod,int year,int y){
        if((this.getModel().equals(mod))&& ((year-this.getYear())>y)){
            System.out.print((++l) + ") ");
            System.out.println("ID:" + getId());
            System.out.print("\""+getBrandCar()+"\", ");
            System.out.print("\""+getModel()+"\", ");
            System.out.print("год выпуска: "+getYear()+", ");
            System.out.println("цвет: \""+getColor()+"\". ");
            System.out.println("Регистрационный номер: "+getNumberReg()+".");
            System.out.println("Цена: "+getPrice()+"у.е.");
            System.out.println("------------------------------------------------------------");


        }

    }
    public void yearPriceCar(int gv,float pr){
        if((this.getYear()==gv)&& (this.getPrice()>pr)){
            System.out.print((++m) + ") ");
            System.out.println("ID:" + getId());
            System.out.print("\""+getBrandCar()+"\", ");
            System.out.print("\""+getModel()+"\", ");
            System.out.print("год выпуска: "+getYear()+", ");
            System.out.println("цвет: \""+getColor()+"\". ");
            System.out.println("Регистрационный номер: "+getNumberReg()+".");
            System.out.println("Цена: "+getPrice()+"у.е.");
            System.out.println("------------------------------------------------------------");


        }

    }
}
