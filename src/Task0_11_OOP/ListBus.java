package Task0_11_OOP;

/**
 * Created by 111 on 29.04.2016.
 */
public class ListBus {
    public static void main(String args[]){
        Bus bus []=new Bus[6];
        bus[0]=new Bus("Иванов И.И.","н 5859 ХА",65, "Богдан", 2009, 80000);
        bus[1]=new Bus("Петров П.П.","п 2859 ХА",229, "Форд", 2015, 10000);
        bus[2]=new Bus( "Васильев В.В.","з 6578 ХА",65, "Мерседес", 2008,90000);
        bus[3]=new Bus("Кротов К.К.","л 2345 ХА",229, "Икарус", 1995,250000);
        bus[4]=new Bus("Федоров Ф.Ф.","г 9089 ХА",65,"ПАЗ", 1989,500000);
        bus[5]=new Bus("Полуперин А.М.","ц 6723 ХА",287,"Неоплан", 2010,70000);
        int n1=65;
        int y1=5;
        int s1 =100000;
        System.out.println("-----------------------------------------------------");
        System.out.println("Список автобусов маршрута № "+n1+" :");
        System.out.println();
        for (int i=0;i<bus.length;i++){
            bus[i].basNum(n1);

        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Список автобусов, которые эксплуатируются более  "+y1+" лет:");
        System.out.println();
        for (int i=0;i<bus.length;i++){
            bus[i].basYear(y1);

        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Список автобусов, пробег которых более  "+s1+" км:");
        System.out.println();
        for (int i=0;i<bus.length;i++){
            bus[i].basMileage(s1);

        }
}}
