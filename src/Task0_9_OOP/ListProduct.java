package Task0_9_OOP;

/**
 * Created by koryak on 28.04.2016.
 */
public class ListProduct {
    public static void main(String args[]){
        Product product[]=new Product[6];
        product[0]=new Product(1,"Кофта",1_11111_11111_7l,"\"Ora\"",59.99f,10,5);
        product[1]=new Product(2,"Кофта",1_21111_11111_6l,"\"Colin's\"",69.99f,12,4);
        product[2]=new Product(3,"Кофта",1_31111_11111_5l,"\"Gloria Jeans\"",49.99f,8,3);
        product[3]=new Product(4,"Брюки",1_31111_12111_4l,"\"Gloria Jeans\"",69.99f,8,4);
        product[4]=new Product(5,"Кофта",1_31111_11121_4l,"\"Gloria Jeans\"",59.99f,8,3);
        product[5]=new Product(6,"Брюки",1_11111_12111_6l,"\"Ora\"",69.99f,10,2);
        String n1="Кофта";
        float p=59.99f;
        int yr=8;

       /* System.out.println("Список товаров:");
        System.out.println();
        for (int i=0;i<product.length;i++){
            System.out.println( product[i].toString());
        }*/
        System.out.println("---------------------------------------------------");
        System.out.println("Cписок товаров  наименования \""+n1+"\":");
        System.out.println("---------------------------------------------------");
        for (int i=0;i<product.length;i++){
            product[i].nameList(n1);
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Cписок товаров  наименования \""+n1+"\", \nцена которых не превосходит "+p+" у.е. :");
        System.out.println("---------------------------------------------------");
        for (int i=0;i<product.length;i++){
            product[i].namePrice(n1,p);
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Cписок товаров, срок хранения которых более "+yr+" лет:");
        System.out.println("---------------------------------------------------");
        for (int i=0;i<product.length;i++){
           product[i].nameYear(yr);
        }
    }
}
