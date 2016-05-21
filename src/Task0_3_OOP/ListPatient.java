package Task0_3_OOP;

import java.util.Arrays;

/**
 * Created by koryak on 26.04.2016.
 */
public class ListPatient {
    public static void main(String args[]){
        Patient patient[]=new Patient[5];
        patient[0]=new Patient(1,"Иванов", "Иван", "Иванович"," Харьков,ул.Ганны,д.48 ", "0671234567",12345,"ОРВИ");
        patient[1]=new Patient(2,"Сидорова", "Анна", "Сидоровна"," Харьков,ул.Гоголя,д.2, кв. 5 ","0677777777",22345,"Беременность");
        patient[2]=new Patient(3,"Кукушкина", "Марина", "Ивановна"," Харьков,ул.Тобольская,д.34, кв. 12 ","0672222222",33345,"Беременность");
        patient[3]=new Patient(4,"Бук", "Инна", "Максимовна"," Харьков,ул.Мироносицкая,д.12, кв. 7 ","0977777777",44345,"ОРВИ");
        patient[4]=new Patient(5,"Полуперин", "Апполон", "Иванович"," Харьков,пр.Гагарина,д.126, кв. 4 ","0688888888",55345,"Травма руки");
        int p=22222;
        int s=55555;
  /* System.out.println("Список всех пациентов :");
        System.out.println();
        for (int i=0;i<5;i++){
            System.out.println(patient[i].toString());
        }*/

        System.out.println("Список пациентов, номера мед. карт которых находятся "+"\nмежду 22222 и 55555:");
        System.out.println();
        for (int i=0;i<patient.length;i++){
            Arrays.sort(patient);
            patient[i].NCard(p,s);

        }
        System.out.println("Список пациентов c диагнозом \"беременность\":");
        System.out.println();
        for (int i=0;i<patient.length;i++){
            Arrays.sort(patient);
            patient[i].Diagnos();

        }
    }
}
