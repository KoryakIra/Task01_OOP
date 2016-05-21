package Task0_4_OOP;

import java.util.Arrays;

/**
 * Created by koryak on 26.04.2016.
 */
public class ListAbiturient {
    public static void  main(String args[]){
        Abiturient abiturient[]=new Abiturient[10];
        abiturient[0]=new Abiturient(1,"Иванов", "Иван", "Иванович"," Харьков,ул.Ганны,д.48 ", "0671234567",4,5,5);
        abiturient[1]=new Abiturient(2,"Сидорова", "Анна", "Сидоровна"," Харьков,ул.Гоголя,д.2, кв. 5 ","0677777777",4,5,4);
        abiturient[2]=new Abiturient(3,"Кукушкина", "Марина", "Ивановна"," Харьков,ул.Тобольская,д.34, кв. 12 ","0672222222",3,2,4);
        abiturient[3]=new Abiturient(4,"Бук", "Инна", "Максимовна"," Харьков,ул.Мироносицкая,д.12, кв. 7 ","0977777777",4,4,5);
        abiturient[4]=new Abiturient(5,"Полуперин", "Апполон", "Иванович"," Харьков,пр.Гагарина,д.126, кв. 4 ","0688888888",4,5,5);
        abiturient[5]=new Abiturient(6,"Кротов", "Михаил", "Семенович"," Харьков,ул.Чайковского,д.4, кв. 10 ","0505555555",3,3,2);
        abiturient[6]=new Abiturient(7,"Васильев", "Василий", "Иванович"," Харьков,пр.Гагарина,д.38, кв. 16 ","0671111111",3,4,4);
        abiturient[7]=new Abiturient(8,"Федоров", "Федор", "Федорович"," Харьков,ул.Каразина,д.3, кв. 4 ","0633333333",5,5,5);
        abiturient[8]=new Abiturient(9,"Сорокина", "Людмила", "Борисовна"," Харьков,ул.Сумская,д.68, кв. 1 ","0999999999",4,4,5);
        abiturient[9]=new Abiturient(10,"Хохотухина", "Алена", "Сергеевна"," Харьков,ул.Лермонтовская,д.10, кв. 2 ","0505050505",5,5,5);
        int p=3;
        int g=9;
        int seats=5;
        int s=15;
        int ss=12;
        /* System.out.println("Список всех абитуриентов :");
        System.out.println();
        for (int i=0;i<10;i++){
            System.out.println(abiturient[i].toString());
        }*/

        System.out.println();
        System.out.println("Список абитуриентов, имеющих неудовлетворительные оценки: ");
        System.out.println();
        for (int i=0;i<abiturient.length;i++){
            Arrays.sort(abiturient);
        abiturient[i].unsatisfactory(p);}
        System.out.println("-------------------------------------------------------------------");

        System.out.println();
        System.out.println("Cписок абитуриентов, у которых сумма баллов выше \"9\":");
        System.out.println();
        for (int i=0;i<abiturient.length;i++){
            Arrays.sort(abiturient);
            abiturient[i].good(g);
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println();
        System.out.println("Список студентов , имеющих максимальную сумму баллов: ");
        System.out.println();

        for (int i=0;i<abiturient.length;i++){
            Arrays.sort(abiturient);
            abiturient[i].sumMax();
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println();
        System.out.println("Список студентов,имеющих проходную сумму баллов: ");
        System.out.println();
        for (int i=0;i<abiturient.length;i++){
            Arrays.sort(abiturient);
            abiturient[i].sumSat();
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println();
        System.out.println("Список студентов,имеющих полупроходную сумму баллов: ");
        System.out.println();
        for (int i=0;i<abiturient.length;i++){
            Arrays.sort(abiturient);
            abiturient[i].sumPP();
        }
    }
    }






