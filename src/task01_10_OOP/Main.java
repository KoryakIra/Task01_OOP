package task01_10_OOP;

/**
 * Created by koryak on 17.05.2016.
 */
public class Main {
    public  static  void main(String args[]){
        Car car[]=new Car[5];
        car[0]=new Lada(10000f,5.75f,120f);
        car[1]=new Chevrolet(12000f,7f,140f);
        car[2]=new Skoda(18000f,4.93f,180f);
        car[3]=new Opel(1500f,7.2f,150f);
        car[4]=new Kia(14000f,7.5f,140f);
        float s1=170f;
        float s2=130f;
        TaxiStation ts=new TaxiStation();
        System.out.println("В таксопарк входят:");
        System.out.println("-------------------------------------------------------");
        for (int i=0;i<car.length;i++){
            System.out.println((i+1)+". "+car[i].getName()+", "+car[i].getCost()+"у.е.");
            ts.addCar(car[i]);
        }
        System.out.println("Суммарная стоимость автомобилей: "+ts.getCosts()+"у.е.");
        System.out.println("----------------------------------------");
        System.out.println("Автомобили в порядке возрастания расхода топлива: ");
        System.out.println("-------------------------------------------------------");
        for (int i=0;i<car.length;i++){
            for(int j=i+1;j<car.length;j++){
                if(car[i].getFuelConsumption()>car[j].getFuelConsumption()){
                    Car tmp=car[i];
                    car[i]=car[j];
                    car[j]=tmp;
                }
            }
            System.out.println((i+1)+". "+car[i].getName()+", "+car[i].getFuelConsumption()+"л");
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Автомобили, скорость которых менее "+s1+" и более "+s2+" км/ч: ");
        for (int i=0;i<car.length;i++){
            car[i].carSpeed(s1,s2);
        }


    }
}
