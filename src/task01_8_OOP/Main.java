package task01_8_OOP;

/**
 * Created by koryak on 13.05.2016.
 */
public class Main {
    public static void main(String args[]){
        RollingStock rs[]=new RollingStock[8];
        rs[0]=new Coupe(6,"супер мягкий",36,72);
        rs[1]=new Coupe(5,"мягкий",36,72);
        rs[2]=new Lux(8,"VIP",9,36);
        rs[3]=new Lux(7,"Gold",18,72);
        rs[4]=new Plackart(4,"повышенной комфортности",52,104);
        rs[5]=new Plackart(3,"классик",52,104);
        rs[6]=new Common(2,"эконом+",72,110);
        rs[7]=new Common(1,"эконом",72,110);
        int num1=18;
        int num2=72;
        Train train=new Train();
        System.out.println("Поезд состоит из таких вагонов: ");
        System.out.println("---------------------------------------------------");
        for (int i=0;i<rs.length;i++){
            System.out.println((i+1)+". "+rs[i].getType()+", "+rs[i].getComfort()+", мест: "+rs[i].getNumPas()+
                    ", мест для багажа: "+rs[i].getNumBag());
            train.addRollingStock(rs[i]);
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Общество количество мест для пассажиров: "+train.getNumPas());
        System.out.println("---------------------------------------------------");
        System.out.println("Общее количество мест для багажа: "+train.getNumBag());
        System.out.println("---------------------------------------------------");
        System.out.println("Вагоны в порядке повышения комфортности: ");
        System.out.println("---------------------------------------------------");
        for (int i=0;i<rs.length;i++){
            for (int j=i+1;j<rs.length;j++){
                if(rs[i].getNumComfort()>rs[j].getNumComfort()){
                    RollingStock tmp =rs[i];
                    rs[i]=rs[j];
                    rs[j]=tmp;

                }
            }
            System.out.println((i+1)+". "+rs[i].getType()+", "+rs[i].getComfort());
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Вагоны вмещающие более "+num1+" и менее "+num2+" пассажиров:");
        System.out.println("---------------------------------------------------");
        for (int i=0;i<rs.length;i++){
            rs[i].numPas(num1,num2);
        }


    }
}
