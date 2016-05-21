package Task01_1_OOP;

/**
 * Created by 111 on 05.05.2016.
 */
public class Main {
    public static void main(String args []){
        Flowers fl[]=new Flowers[3];
        fl[0]=new Rose(12.5f,"красная",8,110);
        fl[1]=new Gladiolus(9.75f,"белый",12,120);
        fl[2]=new Dahlia(8.25f,"вишневый",11,90);
        Accessories accessories[]=new Accessories[3];
        accessories[0]=new Accessories("Сетчатая обертка",7.25f);
        accessories[1]=new Accessories("Атласный бант",3.75f);
        accessories[2]=new Accessories("Капроновая бабочка",5.55f);
        int minHour=24;
        int more=120;
        int less=100;
        Bouquet bouquet=new Bouquet();
        System.out.println("----------------------------------------------------");
        System.out.println("В букете присутствуют следующие цветы: ");
        for(int i=0;i<fl.length;i++)
        {
            bouquet.addFlowers(fl[i]);
            System.out.println(fl[i].getName()+" "+fl[i].getColor()+" по цене: "+fl[i].getPrice()+" у.е. за единицу");
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Букет оформлен в следующие аксессуары: ");
        for(int i=0;i<fl.length;i++){
            bouquet.addAccessories(accessories[i]);
            System.out.println(accessories[i].getName()+" по цене: "+accessories[i].getPrice()+" у.е. за единицу");
        }
        System.out.println("----------------------------------------------------");

        System.out.println("Cтоимость букета: "+bouquet.getPrice()+" у.е");

        System.out.println("----------------------------------------------------");

        System.out.println("Цветы из букета в порядке уменьшения свежести:");
        for (int i=0;i<fl.length;i++){
        for (int j=i+1;j<fl.length;j++){
            if (fl[i].getHour()>fl[j].getHour()){
                Flowers tmp=fl[j];
            fl[j]=fl[i];
            fl[i]=tmp;
        }}
            System.out.println(fl[i].getName()+", " +fl[i].getHour()+" часов ");
    }
        System.out.println("----------------------------------------------------");

        System.out.println("Цветок, длина стебля которого находится \nв диапазоне между "+less+" и "+more+" см:");
        for (int i=0;i<fl.length;i++){
            fl[i].flowerLength(more,less);
    }
}}
