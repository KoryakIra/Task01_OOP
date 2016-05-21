package task01_9_OOP;

/**
 * Created by 111 on 14.05.2016.
 */
public class Main {
    public static void main(String args[]){
        Aircraft air[]=new Aircraft[5];
        air[0]=new Boeing747(467,76300f,14800f,243400f);
        air[1]=new Boeing737(189,20240f,5080f,26030f);
        air[2]=new AirbusA320(180,18600f,5550f,29840f);
        air[3]=new Tupolev214(210,25200f,6200f,40730f);
        air[4]=new Superjet100(98,12250f,4420f,15805f);
        float d1=15805f;
        float d2=40730f;
        MyCompany mc=new MyCompany();
        System.out.println("Самолеты авиакомпании \"MyCompany\": ");
        System.out.println("-----------------------------------------------");
        for (int i=0;i<air.length;i++){
            System.out.println((i+1)+". "+air[i].getName()+", мест "+air[i].getNumPas());
            mc.addAir(air[i]);
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Суммарная вместительность самолетов: "+mc.getNumPas()+" мест");
        System.out.println("Суммарная грузоподъемность самолетов: "+mc.getCapacity()+" кг");
        System.out.println("-----------------------------------------------");
        System.out.println("Самолеты авиакомпании \"MyCompany\" \nв порядке увеличения дальности полета :");
        System.out.println("-----------------------------------------------");
        for (int i=0;i<air.length;i++){
            for (int j=i+1;j<air.length;j++){
                if (air[i].getDistance()>air[j].getDistance()){
                    Aircraft tmp=air[i];
                    air[i]=air[j];
                    air[j]=tmp;
                }
            }
            System.out.println((i+1)+". "+air[i].getName()+", "+air[i].getDistance()+" км");
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Самолеты с емкостью топливных баков более "+d1+" л \nи менее "+d2+"л :");
        for (int i=0;i<air.length;i++){
            air[i].airCapacity(d1,d2);
        }
    }
}
