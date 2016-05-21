package Task0_6_OOP;

/**
 * Created by koryak on 27.04.2016.
 */
public class ListHouse {
    public static void main(String args[]){
        House house[]=new House[10];
        house[0]=new House(1,31,70,4,3,"пр.Гагарина","панельный",90);
        house[1]=new House(2,48,50,3,2,"пр.Гагарина","панельный",90);
        house[2]=new House(3,12,90,5,4,"ул.Чернышевского","кирпичный",150);
        house[3]=new House(4,8,75,3,3,"ул.Маяковского","кирпичный",150);
        house[4]=new House(5,2,55,1,2,"ул.Чернышевского","кирпичный",160);
        house[5]=new House(6,26,49,5,2,"ул.1й Конной Армии","кирпичный",150);
        house[6]=new House(7,122,66,7,3,"пр.Гагарина","панельный",90);
        house[7]=new House(8,220,68,3,3,"пр.Гагарина","панельный",90);
        house[8]=new House(9,48,86,6,2,"пр.Гагарина","кирпичный",200);
        house[9]=new House(10,15,100,2,5,"ул.Чернышевского","кирпичный",160);
        int rn=3,rn2=2,rn3=8,s=70;


           /* System.out.println("Общий список :");
        System.out.println();
        for (int i=0;i<house.length;i++){
            System.out.println(house[i].toString());
        }*/
        System.out.println();
        System.out.println("Cписок квартир, имеющих  "+rn+"  комнаты:");
        System.out.println();
        for (int i=0;i<house.length;i++){
            house[i].roomsNumber(rn);
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Cписок квартир, имеющих "+rn2+" комнаты и расположенных \n" +
                "между "+rn2+" и "+rn3+" этажами:\n");

        for (int i=0;i<house.length;i++){
            house[i].rNumberAndFloar(rn2,rn3);
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Cписок квартир, имеющих площадь,\n" +
              " превосходящую "+s+" квадратных метров:\n");
        for (int i=0;i<house.length;i++){
            house[i].moreSquare(s);
        }

}
}
