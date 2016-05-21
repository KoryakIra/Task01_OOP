package task01_6_OOP;

/**
 * Created by koryak on 12.05.2016.
 */
public class Main {
    public static void main(String args[]){
        Stones stones[]=new Stones[5];
        stones[0]=new Diamond(1.0f,10.0f,200.0f,3.52f,"прозрачный");
        stones[1]=new Sapphire(1.2f,9.0f,180.0f,4.0f,"синий");
        stones[2]=new Ruby(0.8f,9.0f,175.0f,4.0f,"красный");
        stones[3]=new Emerald(1.1f,7.5f,150.f,2.7f,"зеленый");
        stones[4]=new Amethyst(1.2f,7.0f,125.f,2.65f,"фиолетовый");
        float den1 =2.65f;
        float den2 =4.0f;
        Necklace necklace=new Necklace();
        System.out.println("В ожерелье входят следующие камни:");
        for (int i=0;i<stones.length;i++){
            System.out.println(stones[i].getName()+" "+stones[i].getWeightCarats()+" карат (цена "+stones[i].getPrice()+" у.е.)");
            necklace.addStones(stones[i]);
        }
        System.out.println("-------------------------------------------------");
            System.out.println("Стоимость ожерелья "+necklace.getPrice()+" у.е.");
        System.out.println("Суммарный вес камней "+necklace.getWeightCarats()+" карат.");
        System.out.println("-------------------------------------------------");
        System.out.println("Камни в ожерелье, соответствующие диапазону \nплотности между "+den1+" гр/см3 и "+den2+" гр/см3:");
        for (int i=0;i<stones.length;i++){
            stones[i].stonesDensity(den1,den2);
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Камни в ожерелье по возрастанию ценности: ");
        for (int i=0;i<stones.length;i++){
            for (int j=i+1;j<stones.length;j++){
                if(stones[i].getPrice()>stones[j].getPrice()){
                    Stones tmp=stones[j];
                    stones[j]=stones[i];
                    stones[i]=tmp;
                }
            }
            System.out.println(stones[i].getName());
        }




}}
