package Task0_5_OOP;

/**
 * Created by 111 on 26.04.2016.
 */
public class Book {
    public int ID;
    public String name;
    public String author;
    public String publishHouse;
    public int year;
    public int pages;
    public int price;
    public String bindingType;
    static int n=0,l=0,m=0;

    public Book() {
    }

    public Book(int ID, String name, String author, String publishHouse, int year, int pages, int price, String bindingType) {
        this.ID = ID;
        this.name = name;
        this.author = author;
        this.publishHouse = publishHouse;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishHouse() {
        return publishHouse;
    }

    public void setPublishHouse(String publishHouse) {
        this.publishHouse = publishHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public void authorBook(String au){
        if (this.getAuthor().equals(au)){
            System.out.print(++n+")");
            System.out.println("\""+getName()+"\" ");
            System.out.println("Автор "+getAuthor()+" ");
            System.out.println("Издательство: "+getPublishHouse()+"");
            System.out.println("Год издания: "+getYear());
            System.out.println("Цена: "+getPrice()+"грн");
            System.out.println("Переплет: "+getBindingType()+"");
            System.out.println();
        }
    }
    public  void pubHouse(String ph){
        if (this.getPublishHouse().equals(ph)){
            System.out.print(++l+")");
            System.out.println("\""+getName()+"\" ");
            System.out.println("Автор "+getAuthor()+" ");
            System.out.println("Издательство: "+getPublishHouse()+"");
            System.out.println("Год издания: "+getYear());
            System.out.println("Цена: "+getPrice()+"грн");
            System.out.println("Переплет: "+getBindingType()+"");
            System.out.println();
        }
    }
    public void publishYear(int yr){
        if (this.getYear()>yr){
            System.out.print(++m+")");
            System.out.println("\""+getName()+"\" ");
            System.out.println("Автор "+getAuthor()+" ");
            System.out.println("Издательство: "+getPublishHouse()+"");
            System.out.println("Год издания: "+getYear());
            System.out.println("Цена: "+getPrice()+"грн");
            System.out.println("Переплет: "+getBindingType()+"");
            System.out.println();
        }

    }

    @Override
    public String toString() {
        return "Book{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishHouse='" + publishHouse + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }
}
