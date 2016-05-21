package Task0_2_OOP;

import java.util.Arrays;

/**
 * Created by koryak on 26.04.2016.
 */
public class ListCustomer {
    public static void main(String args []){
        Customer customer[]=new Customer[5];
        customer[0]=new Customer(1,"Иванов", "Иван", "Иванович"," Харьков,ул.Ганны,д.48 ",1111_1111_1111_1111l,123456789l);
        customer[1]=new Customer(2,"Петров", "Петр", "Петрович"," Харьков,ул.Галана,д.3, кв. 13 ",2222_2222_2222_2222l,123123123l);
        customer[2]=new Customer(3,"Сидорова", "Анна", "Сидоровна"," Харьков,ул.Гоголя,д.2, кв. 5 ",3333_1111_1111_1111l,123321789l);
        customer[3]=new Customer(4,"Васильев", "Василий", "Иванович"," Харьков,пр.Гагарина,д.38, кв. 16 ",1111_2222_2222_2222l,123321123l);
        customer[4]=new Customer(5,"Кукушкина", "Марина", "Ивановна"," Харьков,ул.Тобольская,д.34, кв. 12  ",1111_3333_2222_2222l,123321321l);
        long p=1111_2222_3333_4444l;
        long s=2222_3333_3333_3333l;

        /*System.out.println("Список всех покупателей :");
        System.out.println();
        for (int i=0;i<5;i++){

            System.out.println(customer[i].toString());
        }*/
        System.out.println();
        System.out.println("Список всех покупателей в алфавитном порядке :");
        System.out.println();
        Arrays.sort(customer);
        for (int i=0;i<customer.length;i++){
            System.out.print((i+1)+") ");
           customer[i].ABCList();
            System.out.println();
        }

        System.out.print("Список покупателей, номера кредитных карт которых находятся "+"\nмежду \"1111 2222 3333 4444\" и \"2222 3333 3333 3333\":");
        for (int i=0;i<customer.length;i++){
            customer[i].NCard(p,s);
            System.out.println();


        }
    }
}

