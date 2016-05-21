package Task0_7_OOP;

import java.util.Arrays;

/**
 * Created by koryak on 27.04.2016.
 */
public class ListPhone {
    public static void main(String args[]) {
        Phone phones[] = new Phone[8];
        phones[0] = new Phone(1, "Иванов", "Иван", "Иванович",  " Харьков,ул.Ганны,д.48 ", 1111_1111_1111_1111l, 50, 0,50.41f,18.52f );
        phones[1] = new Phone(2, "Петров", "Петр", "Петрович", " Харьков,ул.Галана,д.3, кв. 13 ", 1111_2222_1111_1111l, 0, -20, 500.09f,0f );
        phones[2] = new Phone(3, "Сидорова", "Анна", "Сидоровна",  " Харьков,ул.Гоголя,д.2, кв. 5 ", 1111_3333_1111_1111l, 0, -10, 80.48f,27.24f );
        phones[3] = new Phone(4, "Васильев", "Василий", "Иванович", " Харьков,пр.Гагарина,д.38, кв. 16 ", 1111_4444_1111_1111l, 90, 0, 50.41f,17.49f );
        phones[4] = new Phone(5, "Кукушкина", "Марина", "Ивановна", " Харьков,ул.Тобольская,д.34, кв. 12 ",1111_5555_1111_1111l, 50, 0, 100.22f,0f );
        phones[5] = new Phone(6, "Кротов", "Михаил", "Семенович"," Харьков,ул.Чайковского,д.4, кв. 10 ",1111_6666_1111_1111l, 0, -20, 350.52f,29.13f );
        phones[6] = new Phone(7, "Бук", "Инна", "Максимовна",  " Харьков,ул.Мироносицкая,д.12, кв. 7 ", 1111_7777_1111_1111l, 30, 0, 70.25f,0f );
        phones[7] = new Phone(8, "Федоров", "Федор", "Федорович", " Харьков,ул.Каразина,д.3, кв. 4 ", 1111_8888_1111_1111l, 100, 0, 50.48f,0f );
        Float t=300.00f;
        System.out.println();
        System.out.println("Cведения об абонентах, у которых время внутригородских разговоров \n" +
                "превышает "+t+"(мин.сек):\n ");
        System.out.println();
        for (int i=0;i<phones.length;i++){
            phones[i].timeLim(t);
            System.out.println();
    }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Cведения об абонентах, которые пользовались междугородной связью:");
        System.out.println();
        for (int i=0;i<phones.length;i++){
            phones[i].globalCall();
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Cведения об абонентах в алфавитном порядке:");
        System.out.println();
        Arrays.sort(phones);
        for (int i=0;i<phones.length;i++){
            phones[i].ABCList();
            System.out.println();
        }
}}
