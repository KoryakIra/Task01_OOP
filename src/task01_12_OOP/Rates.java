package task01_12_OOP;

/**
 * Created by koryak on 17.05.2016.
 */
public class Rates {
    private final String name;
    private final int clientNum;
    private final float monthlyFee;
    private final int freeMinutes;
    static int n=0;

    public Rates(String name, int clientNum, float monthlyFee, int freeMinutes) {
        this.name = name;
        this.clientNum = clientNum;
        this.monthlyFee = monthlyFee;
        this.freeMinutes = freeMinutes;
    }

    public String getName() {
        return name;
    }

    public int getClientNum() {
        return clientNum;
    }

    public float getMonthlyFee() {
        return monthlyFee;
    }

    public int getFreeMinutes() {
        return freeMinutes;
    }
    public void freeMinutes(int t1,int t2) {
        if (this.getFreeMinutes() < t2 && this.getFreeMinutes() > t1) {
            System.out.print((++n)+". ");
            System.out.print(getName()+", ");
            System.out.println(getFreeMinutes()+" мин");

        }
    }
}
