package Task0_10_OOP;

/**
 * Created by koryak on 28.04.2016.
 */
public class Train {
    private String town;
    private String trainId;
    private float depTime;
    private int common;
    private int coupe;
    private int reservedSeat;
    private int lux;
    static int k=0,l=0,m=0;
    public Train() {
    }

    public Train(String town, String trainId, float depTime, int common, int coupe, int reservedSeat, int lux) {
        this.town = town;
        this.trainId = trainId;
        this.depTime = depTime;
        this.common = common;
        this.coupe = coupe;
        this.reservedSeat = reservedSeat;
        this.lux = lux;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String rainId) {
        this.trainId = rainId;
    }

    public float getDepTime() {
        return depTime;
    }

    public void setDepTime(float depTime) {
        this.depTime = depTime;
    }

    public int getCommon() {
        return common;
    }

    public void setCommon(int common) {
        this.common = common;
    }

    public int getCoupe() {
        return coupe;
    }

    public void setCoupe(int coupe) {
        this.coupe = coupe;
    }

    public int getReservedSeat() {
        return reservedSeat;
    }

    public void setReservedSeat(int reservedSeat) {
        this.reservedSeat = reservedSeat;
    }

    public int getLux() {
        return lux;
    }

    public void setLux(int lux) {
        this.lux = lux;
    }
    public void toCity(String s1){
        if (this.getTown().equals(s1)){
            System.out.println((++k)+") ");
            System.out.println("Поезд № "+getTrainId()+" ");
            System.out.println("Пункт назначения: "+getTown()+" ");
            System.out.println("Время отправления: "+getDepTime()+" час.мин. ");
            System.out.println("Купе: "+getCoupe()+" мест");
            System.out.println("Плацкарт: "+getReservedSeat()+" мест");
            System.out.println("Люкс: "+getLux()+" мест");
            System.out.println("Общие: "+getCommon()+" мест");
            System.out.println("---------------------------------------------------------");

        }
    }
    public void toCityTime(String s2,float t1){
        if ((this.getTown().equals(s2))&&(this.getDepTime()>t1)){
            System.out.println((++l)+") ");
            System.out.println("Поезд № "+getTrainId()+" ");
            System.out.println("Пункт назначения: "+getTown()+" ");
            System.out.println("Время отправления: "+getDepTime()+" час.мин. ");
            System.out.println("Купе: "+getCoupe()+" мест");
            System.out.println("Плацкарт: "+getReservedSeat()+" мест");
            System.out.println("Люкс: "+getLux()+" мест");
            System.out.println("Общие: "+getCommon()+" мест");
            System.out.println("---------------------------------------------------------");

        }
    }
    public void toCityCommon(String s1){
        if ((this.getTown().equals(s1))&&(this.getCommon()!=0)){
            System.out.println((++m)+") ");
            System.out.println("Поезд № "+getTrainId()+" ");
            System.out.println("Пункт назначения: "+getTown()+" ");
            System.out.println("Время отправления: "+getDepTime()+" час.мин. ");
            System.out.println("Купе: "+getCoupe()+" мест");
            System.out.println("Плацкарт: "+getReservedSeat()+" мест");
            System.out.println("Люкс: "+getLux()+" мест");
            System.out.println("Общие: "+getCommon()+" мест");
            System.out.println("---------------------------------------------------------");

        }
    }

    @Override
    public String toString() {
        return "Train{" +
                "town='" + town + '\'' +
                ", rainId=" + trainId +
                ", depTime=" + depTime +
                ", common=" + common +
                ", coupe=" + coupe +
                ", reservedSeat=" + reservedSeat +
                ", lux=" + lux +
                '}';
    }
}
