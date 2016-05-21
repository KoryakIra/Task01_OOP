package task01_3_OOP;

/**
 * Created by 111 on 06.05.2016.
 */
public class Main {
    public static void main(String args[]){
        ElectricalAppliance ea[]=new ElectricalAppliance[5];
        ea[0]=new ElectricKettle(1700,"металлик",1.0f,true);
        ea[1]=new Dishwasher(2400,",белая",30.0f,true);
        ea[2]=new Hairdryer(1600,"синий",0.5f,false);
        ea[3]=new OilCoolers(1500,"серый",8.5f,false);
        ea[4]=new Refrigerator(200,"салатовый",65.3f,true);
        float w1=0.5f;
        float w2=60.0f;
        ElectricalNetwork electricalNetwork=new ElectricalNetwork();
        System.out.println("В электросеть включены следующие электроприборы: ");
        for (int i=0;i<ea.length;i++){
            if (ea[i].isSwitchStatus())
            {
                electricalNetwork.addElectricalAppliance(ea[i]);
                System.out.println(ea[i].getName()+" (мощность "+ea[i].getPower()+" Вт)");
            }
        }
        System.out.println("---------------------------------------------");
        System.out.println("Суммарная мощность подключенных приборов: "+electricalNetwork.getPower()+" Вт.");
        System.out.println("---------------------------------------------");
        System.out.println("Электроприборы в порядке увеличения мощности:");
        for (int i=0;i<ea.length;i++){
            for (int j=i+1;j<ea.length;j++){
                if (ea[i].getPower()>ea[j].getPower()){
                    ElectricalAppliance tmp=ea[j];
                    ea[j]=ea[i];
                    ea[i]=tmp;
                }
            }
            System.out.println(ea[i].getName()+" "+ea[i].getPower()+ " Вт");
        }
        System.out.println("---------------------------------------------");
        System.out.println("Приборы, вес которых в диапазоне между  "+w1+" и "+ w2+" кг :");
        for (int i=0;i<ea.length;i++){
        ea[i].appWeight(w1,w2);
    }

}}
