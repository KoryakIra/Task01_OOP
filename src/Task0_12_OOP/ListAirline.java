package Task0_12_OOP;

/**
 * Created by 111 on 04.05.2016.
 */
public class ListAirline {
    public static void main(String args[]){
        Airline airline[]=new Airline[8];
        airline[0]=new Airline("Одесса",287,"Boeing 737",12,45,"понедельник");
        airline[1]=new Airline("Киев",235,"Boeing 737",10,15,"понедельник");
        airline[2]=new Airline("Киев",237,"Airbus A319",19,55,"четверг");
        airline[3]=new Airline("Киев",239,"Boeing-737",9,15,"четверг");
        airline[4]=new Airline("Киев",241,"Boeing-737",22,10,"пятница");
        airline[5]=new Airline("Одесса",389,"Airbus A319",8,30,"четверг");
        airline[6]=new Airline("Киев",243,"Boeing-737",9,25,"суббота");
        airline[7]=new Airline("Киев",245,"Airbus A320",18,45,"воскресение");
        String d="четверг";
        int h=9;

        /*System.out.println("Расписание полетов: ");
        System.out.println();
        for (int i=0;i<airline.length;i++){
            System.out.println(airline[i]);
        }*/
        System.out.println("Cписок рейсов для пункта назначения Киев: ");
        System.out.println("--------------------------------------------------");
        for (int i=0;i<airline.length;i++){
            airline[i].toCity();
        }
        System.out.println("Список рейсов в "+d+": ");
        System.out.println("--------------------------------------------------");
        for (int i=0;i<airline.length;i++){
            airline[i].DayWeek(d);
        }
        System.out.println("Cписок рейсов в "+d+", \nвремя вылета которых позднее "+h+" часов :");
        System.out.println("--------------------------------------------------");
        for (int i=0;i<airline.length;i++){
            airline[i].DayAndHour(d,h);
    }
}}
