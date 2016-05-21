package task01_2_OOP;

/**
 * Created by 111 on 05.05.2016.
 */
public class Main {
    public static void main(String args []){
        Sweets sw[]=new Sweets[5];
        sw[0]=new Lollipop(50,2.25f,80);
        sw[1]=new Biscuit(120,6.75f,40);
        sw[2]=new Wafer(80,4.35f,30);
        sw[3]=new Marzipan(100,8.45f,50);
        sw[4]=new ChocolateCandies(90,7.55f,45);
        int more=80;
        int less=40;
        Present present=new Present();
        System.out.println("---------------------------------------------");
        System.out.println("В новогодний подарок входят следующие сладости: ");
for (int i=0;i<sw.length;i++){
    present.addSweets(sw[i]);
    System.out.println(sw[i].getName()+" весом "+sw[i].getWeight()+" грамм");
}
        System.out.println("---------------------------------------------");
        System.out.println("Вес новогоднего, сладкого подарка "+present.getWeight()+" грамм");
        System.out.println("---------------------------------------------");
        System.out.println("Сладости в порядке увеличения стоимости:");
        for (int i=0;i<sw.length;i++){
            for (int j=i+1;j<sw.length;j++){
                if (sw[i].getPrice()>sw[j].getPrice()){
                    Sweets tmp=sw[j];
                    sw[j]=sw[i];
                    sw[i]=tmp;
                }
            }
            System.out.println(sw[i].getName()+" по цене "+sw[i].getPrice()+" грн");
        }
        System.out.println("---------------------------------------------");
        System.out.println("Конфеты, уровень сахара в которых \nнаходится в диапазоне между "+less+" и "+more+" процентов: ");
        for (int i=0;i<sw.length;i++){
            sw[i].sugarCandies(more,less);
        }

}}
