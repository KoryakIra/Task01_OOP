package Task0_6_OOP;

/**
 * Created by koryak on 27.04.2016.
 */
public class House {
    private int id;
    private int numFlat;
    private int square;
    private int level;
    private int numRoom;
    private String street;
    private String buildType;
    private int period;
    static int n=0,m=0,l=0;

    public House() {
    }

    public House(int id, int numFlat, int square, int level, int numRoom, String street, String buildType, int period) {
        this.id = id;
        this.numFlat = numFlat;
        this.square = square;
        this.level = level;
        this.numRoom = numRoom;
        this.street = street;
        this.buildType = buildType;
        this.period = period;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumFlat() {
        return numFlat;
    }

    public void setNumFlat(int numFlat) {
        this.numFlat = numFlat;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getNumRoom() {
        return numRoom;
    }

    public void setNumRoom(int numRoom) {
        this.numRoom = numRoom;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildType() {
        return buildType;
    }

    public void setBuildType(String buildType) {
        this.buildType = buildType;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
    public void roomsNumber(int rn){
        if (this.getNumRoom()==rn){
            System.out.print((++n)+") ");
            System.out.println("ID:"+getId());
            System.out.print(getStreet()+", ");
            System.out.print("кв. № "+getNumFlat()+", ");
            System.out.print("этаж "+getLevel()+", ");
            System.out.println("комнат: "+getNumRoom()+", ");
            System.out.print("общая площадь "+getSquare()+" кв.м, ");
            System.out.println("тип здания: "+getBuildType()+". ");
            System.out.println("Срок эксплуатации: "+getPeriod()+" лет.");
            System.out.println();
        }

    }
    public void rNumberAndFloar(int rn2,int rn3){
        if ((this.getNumRoom()==rn2)&&(this.getLevel()>rn2)&&(this.getLevel()<rn3)){
            System.out.print((++m)+") ");
            System.out.println("ID:"+getId());
            System.out.print(getStreet()+", ");
            System.out.print("кв. № "+getNumFlat()+", ");
            System.out.print("этаж "+getLevel()+", ");
            System.out.println("комнат: "+getNumRoom()+", ");
            System.out.print("общая площадь "+getSquare()+" кв.м, ");
            System.out.println("тип здания: "+getBuildType()+". ");
            System.out.println("Срок эксплуатации: "+getPeriod()+" лет.");
            System.out.println();
        }

    }
    public void moreSquare(int s){
        if (this.getSquare()>s){
            System.out.print((++l)+") ");
            System.out.println("ID:"+getId());
            System.out.print(getStreet()+", ");
            System.out.print("кв. № "+getNumFlat()+", ");
            System.out.print("этаж "+getLevel()+", ");
            System.out.println("комнат: "+getNumRoom()+", ");
            System.out.print("общая площадь "+getSquare()+" кв.м, ");
            System.out.println("тип здания: "+getBuildType()+". ");
            System.out.println("Срок эксплуатации: "+getPeriod()+" лет.");
            System.out.println();
        }

    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", numFlat=" + numFlat +
                ", square=" + square +
                ", level=" + level +
                ", numRoom=" + numRoom +
                ", street='" + street + '\'' +
                ", buildType='" + buildType + '\'' +
                ", period=" + period +
                '}';
    }
}
