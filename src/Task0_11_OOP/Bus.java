package Task0_11_OOP;

/**
 * Created by 111 on 29.04.2016.
 */
public class Bus {
    private String fio;
    private String numBus;
    private int numRoute;
    private String carBrand;
    private int year;
    private int mileage;
    static int k=0,l=0,m=0;
    public Bus() {
    }

    public Bus(String fio, String numBus, int numRoute, String carBrand, int year, int mileage) {
        this.fio = fio;
        this.numBus = numBus;
        this.numRoute = numRoute;
        this.carBrand = carBrand;
        this.year = year;
        this.mileage = mileage;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getNumBus() {
        return numBus;
    }

    public void setNumBus(String numBus) {
        this.numBus = numBus;
    }

    public int getNumRoute() {
        return numRoute;
    }

    public void setNumRoute(int numRoute) {
        this.numRoute = numRoute;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

public void basNum(int n1){
    if (this.getNumRoute()==n1){
        System.out.println((++k)+") ");
        System.out.println("Водитель: "+getFio()+" ");
        System.out.println("Маршрут № "+getNumRoute()+". ");
        System.out.print(getCarBrand()+", ");
        System.out.print(getNumBus()+", ");
        System.out.print("год выпуска "+getYear()+", ");
        System.out.println("пробег: "+getMileage()+" ");
        System.out.println("-----------------------------------------------------");
    }
}public void basYear(int y1){
        if (2016-this.getYear()>y1){
            System.out.println((++m)+") ");
            System.out.println("Водитель: "+getFio()+" ");
            System.out.println("Маршрут № "+getNumRoute()+". ");
            System.out.print(getCarBrand()+", ");
            System.out.print(getNumBus()+", ");
            System.out.print("год выпуска "+getYear()+", ");
            System.out.println("пробег: "+getMileage()+" ");
            System.out.println("-----------------------------------------------------");
        }
    }
    public void basMileage(int s1){
        if (this.getMileage()>s1){
            System.out.println((++l)+") ");
            System.out.println("Водитель: "+getFio()+" ");
            System.out.println("Маршрут № "+getNumRoute()+". ");
            System.out.print(getCarBrand()+", ");
            System.out.print(getNumBus()+", ");
            System.out.print("год выпуска "+getYear()+", ");
            System.out.println("пробег: "+getMileage()+" ");
            System.out.println("-----------------------------------------------------");
        }
    }
}
