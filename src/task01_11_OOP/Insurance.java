package task01_11_OOP;

/**
 * Created by koryak on 18.05.2016.
 */
public class Insurance {
    private final String name;
    private final float sum;
    private final float risk;
    private final float insuranceMoney;
static int n=0;
    public Insurance(String name, float sum, float risk, float insuranceMoney) {
        this.name = name;
        this.sum = sum;
        this.risk = risk;
        this.insuranceMoney = insuranceMoney;
    }

    public String getName() {
        return name;
    }

    public float getSum() {
        return sum;
    }

    public float getRisk() {
        return risk;
    }

    public float getInsuranceMoney() {
        return insuranceMoney;
    }
    public void InsurMoney(float s1, float s2){
        if(this.getInsuranceMoney()>s1&&this.getInsuranceMoney()<s2){
            System.out.print((++n)+". ");
            System.out.print(getName()+", ");
            System.out.println(getInsuranceMoney()+" у.е.");
        }
    }
}
