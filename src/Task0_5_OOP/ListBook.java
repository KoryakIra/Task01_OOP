package Task0_5_OOP;

/**
 * Created by 111 on 26.04.2016.
 */
public class ListBook {
    public static void main(String args[]){
        Book book []=new Book[10];
        book[0]=new Book( 1,"Граф Монте-Кристо", "Дюма Александр", "Махаон", 2015,542,150, "твердый");
        book[1]=new Book( 2,"Три мушкетёра", "Дюма Александр", "Дом печати", 2014,291, 50,"мягкий");
        book[2]=new Book( 3,"Лебединая дорога", "Семенова Мария", "Дом печати",2010,210,90,"твердый");
        book[3]=new Book( 4,"Гений страшной красоты", "Донцова Дарья", "Мир детектива",2011,105,30,"мягкий");
        book[4]=new Book( 5,"Бабочка в гипсе", "Донцова Дарья", "Мир детектива",2010,116,30,"мягкий");
        book[5]=new Book( 6,"Гарри Поттер и философский камень", " Роулинг Джоан Кэтлин", "Детская литература", 2009,154,90, "твердый");
        book[6]=new Book( 7,"Гарри Поттер и Тайная комната", " Роулинг Джоан Кэтлин", "Детская литература", 2009,139,85, "твердый");
        book[7]=new Book( 8,"Двадцать лет спустя", "Дюма Александр", "Махаон",2015,336,120, "твердый");
        book[8]=new Book( 9,"Черный тюльпан","Дюма Александр", "Дом печати",2014,91,30, "мягкий");
        book[9]=new Book( 10,"Звёздная Тень", "Лукьяненко Сергей ", "Дом печати",2010,140,70, "твердый");
        String au="Дюма Александр";
        String ph="Детская литература";
        int yr=2010;
/*System.out.println("Список книг: ");
        System.out.println();
        for(int i=0;i<=11;i++){
            System.out.println( book[i]);*/
        System.out.println();
        System.out.println("Список книг автора "+au+": ");
        System.out.println();
        for (int i=0;i<book.length;i++){
            book[i].authorBook(au);


        }
        System.out.println("-----------------------------------------------");
        System.out.println("Список книг издательства "+ph+": ");
        System.out.println();
        for (int i=0;i<book.length;i++){
            book[i].pubHouse(ph);
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Список книг, выпущенных после "+yr+" года: ");
        System.out.println();
        for (int i=0;i<book.length;i++){
            book[i].publishYear(yr);

        }
    }
}
