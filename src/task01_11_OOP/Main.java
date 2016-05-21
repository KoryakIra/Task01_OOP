package task01_11_OOP;


/**
 * Created by koryak on 18.05.2016.
 */
public class Main {
    public static void main(String args[]){
        Insurance insurance[]=new Insurance[4];
        insurance[0]=new Life(1000.50f,0.1f,100000f);
        insurance[1]=new Health(150f,0.25f,1500f);
        insurance[2]=new Apartment(300f,0.23f,3000f);
        insurance[3]=new Car11(200f,0.20f,2000f);
        Derivative derivative=new Derivative();
        float s1=1500f;
        float s2=100000f;
        System.out.println("В дериатив входят: ");
        System.out.println("----------------------------------------------------");
        for (int i=0;i<insurance.length;i++){
            System.out.println((i+1)+". "+insurance[i].getName()+", "+insurance[i].getSum()+" у.е.");
          derivative.addInsurance(insurance[i]);
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Сумма дериатива: "+derivative.getSum()+" у.е.");
        System.out.println("----------------------------------------------------");
        System.out.println("Страховые случаи в порядке уменьшения степени риска:");
        for(int i=0;i<insurance.length;i++){
            for (int j=i+1;j<insurance.length;j++){
                if (insurance[i].getRisk()<insurance[j].getRisk()){
                    Insurance tmp=insurance[i];
                    insurance[i]=insurance[j];
                    insurance[j]=tmp;
                }
            }
            System.out.println((i+1)+". "+insurance[i].getName()+", "+insurance[i].getRisk());
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Обязательства со страховыми суммами более "+s1+"у.е.\n и менее "+s2+"у.е.");
        for (int i=0;i<insurance.length;i++){
insurance[i].InsurMoney(s1,s2);
    }
}}
