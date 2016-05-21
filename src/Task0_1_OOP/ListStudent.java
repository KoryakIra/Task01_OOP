package Task0_1_OOP;

import java.util.Date;

/**
 * Created by koryak on 13.04.2016.
 */
public class ListStudent {
    public static void main(String args[]){
        Student student[]=new Student[12];
        student[0]=new Student( 1,"Иванов", "Иван", "Иванович", new Date(1995,9,1)," Харьков,ул.Ганны,д.48 ", "0671234567","Физический",5,"Ф51");
        student[1]=new Student( 2,"Петров", "Петр", "Петрович", new Date(1996,7,17)," Харьков,ул.Галана,д.3, кв. 13 ", "0671231237","Физический",4,"Ф41");
        student[2]=new Student( 3,"Сидорова", "Анна", "Сидоровна",new Date(1997,11,19)," Харьков,ул.Гоголя,д.2, кв. 5 ","0677777777","Исторический",3,"И31");
        student[3]=new Student( 4,"Васильев", "Василий", "Иванович",new Date(1999,2,2)," Харьков,пр.Гагарина,д.38, кв. 16 ","0671111111","Исторический",1,"И11");
        student[4]=new Student( 5,"Кукушкина", "Марина", "Ивановна",new Date(1998,12,23)," Харьков,ул.Тобольская,д.34, кв. 12 ","0672222222","Физический",2,"Ф21");
        student[5]=new Student( 6,"Кротов", "Михаил", "Семенович",new Date(1998,8,2)," Харьков,ул.Чайковского,д.4, кв. 10 ","0505555555","Физический",2,"Ф21");
        student[6]=new Student( 7,"Бук", "Инна", "Максимовна",new Date(1999,2,5)," Харьков,ул.Мироносицкая,д.12, кв. 7 ","0977777777","Исторический",1,"И11");
        student[7]=new Student( 8,"Федоров", "Федор", "Федорович",new Date(1996,6,8)," Харьков,ул.Каразина,д.3, кв. 4 ","0633333333","Физический",4,"Ф41");
        student[8]=new Student( 9,"Сорокина", "Людмила", "Борисовна",new Date(1997,10,5)," Харьков,ул.Сумская,д.68, кв. 1 ","0999999999","Исторический",3,"И31");
        student[9]=new Student( 10,"Полуперин", "Апполон", "Иванович",new Date(1997,4,7), " Харьков,пр.Гагарина,д.126, кв. 4 ","0688888888","Физический",3,"Ф31");
        student[10]=new Student( 11,"Копытин", "Максим", "Игоревич", new Date(1995,6,12)," Харьков,ул.Пушкинская,д.25, кв. 20 ","0676767667","Физический",5,"Ф51");
        student[11]=new Student( 12,"Хохотухина", "Алена", "Сергеевна",new Date(1998,3,8)," Харьков,ул.Лермонтовская,д.10, кв. 2 ","0505050505","Физический",2,"Ф21");
        Date p=new Date(1997,11,19);
       /* System.out.println("Список студентов: ");
        System.out.println();
        for(int i=0;i<=11;i++){
            student[i].list();
        }*/


        System.out.println("Список студентов \"Физического\" факультета: ");
        System.out.println();
        for (int i=0;i<student.length;i++){
          student[i].facultet();
        }
        System.out.println();
        System.out.println("Список студентов 1 курса \"Исторического\" факультета: ");
        System.out.println();
        for(int i=0;i<student.length;i++){
            student[i].faccourse();
        }
        System.out.println();
        System.out.println("Список студентов, которые родились после 1997 года: ");
        System.out.println();
        for (int i=0;i<student.length;i++){
            student[i].datebirth(p);
        }
        System.out.println();
        System.out.println("Список студентов \"Ф41\": ");
        System.out.println();
        for (int i=0;i<student.length;i++){
            student[i].grouppp();
        }
    }

}
