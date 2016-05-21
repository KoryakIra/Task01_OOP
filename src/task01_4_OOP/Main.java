package task01_4_OOP;

/**
 * Created by 111 on 05.05.2016.
 */
public class Main {
    public static void main(String args[]){
        Vegetables veg[]=new Vegetables[4];
        veg[0]=new Cucumber(100,0.5f,16);
        veg[1]=new Tomato(120,1.4f,25);
        veg[2]=new Onion(40,0.8f,14);
        veg[3]=new BulgarianPepper(70,1.2f,15);
        int more=20;
        int less=14;
        Salad salad=new Salad();
        System.out.println("-----------------------------------");
        System.out.println("Салат состоит из следующих овощей: ");
        for (int i=0;i<veg.length;i++){
            salad.addVegetables(veg[i]);
            System.out.println(veg[i].getName()+" калорийность "+veg[i].getCalorificValue()+" ккал");
        }
        System.out.println("-----------------------------------");
        System.out.println("Калорийность салата: "+salad.getCalorificValue()+" ккал");
        System.out.println("---------------------------------------------");
        System.out.println("Овощи в порядке увеличения содержания клетчатки:");
        for (int i=0;i<veg.length;i++){
            for (int j=i+1;j<veg.length;j++){
                if (veg[i].getCellulose()>veg[j].getCellulose()){
                    Vegetables tmp=veg[j];
                    veg[j]=veg[i];
                    veg[i]=tmp;
                }
            }
            System.out.println(veg[i].getName()+" содержание клетчатки "+veg[i].getCellulose()+" грамм");

    }
        System.out.println("---------------------------------------------");
        System.out.println("Овощи, калорийность которых \nнаходится в диапазоне между "+less+" и "+more+" ккал: ");
        for (int i=0;i<veg.length;i++){
            veg[i].CalorificVegetables(more,less);
        }
}}
