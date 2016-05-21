package task01_12_OOP;

/**
 * Created by koryak on 17.05.2016.
 */
public class Main {
    public static void main(String args []){
        Rates rates[]=new Rates[4];
        rates[0]=new Sun(100000,65f,70);
        rates[1]=new Morning(20000,30f,30);
        rates[2]=new Evening(30000,45.5f,50);
        rates[3]=new Lux(60000,100f,120);
        int t1=30;
        int t2=120;
        System.out.println("Тарифы компании: ");
        System.out.println("---------------------------------------------------------");
       ListRates lr=new ListRates();
        for (int i=0;i<rates.length;i++){
            System.out.println((i+1)+". "+rates[i].getName()+", "+rates[i].getClientNum()+" клиентов");
            lr.addNum(rates[i]);
        }
        System.out.println("Общая численность клиентов: "+lr.getClientNum()+" человек");
        System.out.println("---------------------------------------------------------");
        System.out.println("Тарифы по возрастанию абон платы: ");
        for (int i=0;i<rates.length;i++){
            for (int j=i+1;j<rates.length;j++){
                if (rates[i].getMonthlyFee()>rates[j].getMonthlyFee()){
                    Rates tmp=rates[i];
                    rates[i]=rates[j];
                    rates[j]=tmp;
                }
            }
            System.out.println((i+1)+". "+rates[i].getName()+", "+rates[i].getMonthlyFee()+" грн");
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("Тарифы, количество бесплатных минут в котором более "+t1+" и менее "+t2+" минут");
        for (int i=0;i<rates.length;i++){
            rates[i].freeMinutes(t1,t2);
        }





    }
}
