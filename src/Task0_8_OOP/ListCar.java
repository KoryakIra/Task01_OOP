package Task0_8_OOP;

/**
 * Created by koryak on 27.04.2016.
 */
public class ListCar {
    public static void main(String args []){
        Car car[]=new Car[8];
        car[0]=new Car(1,"Mazda","Mazda 3 Sedan",2009,"red",10000f,1234);
        car[1]=new Car(2,"Toyota","Corolla",2006,"black",8000f,2345);
        car[2]=new Car(3,"Mazda","Mazda 3 Sedan",2008,"white",9000f,2323);
        car[3]=new Car(4,"Toyota","Rav4",2012,"cherry",18000f,1266);
        car[4]=new Car(5,"Toyota","Auris",2007,"blue",8000f,2523);
        car[5]=new Car(6,"Mazda","Mazda 3 Sedan",2007,"black",8000f,1444);
        car[6]=new Car(7,"Toyota","Camry",2012,"white",20000f,1333);
        car[7]=new Car(8,"Mazda","Mazda CX-7",2012,"black",20000f,1222);

    /*System.out.println("Список всех автомобилей :");
        System.out.println();
        for (int i=0;i<Car.length;i++){
         System.out.println(Car[i].toString());
        }*/
        String brC="Toyota";
        int y=7;
        int year=2016;
        int gv=2012;
        float pr=18000f;

        String mod="Mazda 3 Sedan";
        System.out.println();
        System.out.println("Список автомобилей марки \""+brC+"\":");
        System.out.println();
        for (int i=0;i<car.length;i++){
            car[i].brand(brC);
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("Список автомобилей модели \""+mod+"\", \nнаходящихся в эксплуатации более "+y+" лет:");
        System.out.println();
        for (int i=0;i<car.length;i++){
            car[i].modelCar(mod,year,y);
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("Список автомобилей  \""+gv+"\" года выпуска,\nстоимость которых выше "+pr+" у.е.:");
        System.out.println();
        for (int i=0;i<car.length;i++){
            car[i].yearPriceCar(gv,pr);
        }
}}
