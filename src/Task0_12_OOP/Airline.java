package Task0_12_OOP;

/**
 * Created by 111 on 04.05.2016.
 */
public class Airline {
    private String city;
    private int num;
    private String type;
    private int hour;
    private int min;
    private String day;
    static int k=0,l=0,s=0;

    public Airline() {
    }

    public Airline(String city, int num, String type,int hour, int min, String day) {
        this.city = city;
        this.num = num;
        this.type = type;
        this.hour = hour;
        this.min = min;
        this.day = day;
    }

    public String getCity() {
        return city;
    }

    public int getNum() {
        return num;
    }

    public String getType() {
        return type;
    }
    public int getHour() {
        return hour;
    }
    public int getMin() {
        return min;
    }

    public String getDay() {
        return day;
    }
    public void toCity(){
        if (this.getCity().equals("Киев")){
            System.out.println((++k)+") ");
            System.out.println("Пункт назначения: "+getCity()+" ");
            System.out.println("Рейс №: "+getNum()+" ");
            System.out.println("День вылета: "+getDay()+" ");
            System.out.println("Время вылета: "+getHour()+":"+getMin());
            System.out.println("Тип самолета: "+getType());
            System.out.println("--------------------------------------------------");
        }
    }
    public void DayWeek(String d){
        if (this.getDay().equals(d)){
            System.out.println((++l)+") ");
            System.out.println("Пункт назначения: "+getCity()+" ");
            System.out.println("Рейс №: "+getNum()+" ");
            System.out.println("День вылета: "+getDay()+" ");
            System.out.println("Время вылета: "+getHour()+":"+getMin());
            System.out.println("Тип самолета: "+getType());
            System.out.println("--------------------------------------------------");
        }
    }
    public void DayAndHour(String d,int h){
        if ((this.getDay().equals(d))&&(this.getHour()>=h)){
            System.out.println((++s)+") ");
            System.out.println("Пункт назначения: "+getCity()+" ");
            System.out.println("Рейс №: "+getNum()+" ");
            System.out.println("День вылета: "+getDay()+" ");
            System.out.println("Время вылета: "+getHour()+":"+getMin());
            System.out.println("Тип самолета: "+getType());
            System.out.println("--------------------------------------------------");
        }
    }


    @Override
    public String toString() {
        return "Airline{" +
                "city='" + city + '\'' +
                ", num=" + num +
                ", type='" + type + '\'' +
                ", hour=" + hour +
                ", min=" + min +
                ", day='" + day + '\'' +
                '}';
    }
}
