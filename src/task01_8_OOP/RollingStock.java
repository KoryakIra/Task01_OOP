package task01_8_OOP;

/**
 * Created by koryak on 13.05.2016.
 */
public class RollingStock {

    private final String type;
    private final int numComfort;
    private final String comfort;
    private final int numPas;
    private final int numBag;
    static int n=0;

    public RollingStock(String type, int numComfort, String comfort, int numPas, int numBag) {

        this.type = type;
        this.numComfort = numComfort;
        this.comfort = comfort;
        this.numPas = numPas;
        this.numBag = numBag;
    }

    public String getType() {
        return type;
    }

    public int getNumComfort() {
        return numComfort;
    }

    public String getComfort() {
        return comfort;
    }

    public int getNumPas() {
        return numPas;
    }

    public int getNumBag() {
        return numBag;
    }
    public void numPas(int num1,int num2){
        if (this.getNumPas()<num2&&this.getNumPas()>num1){
            System.out.print((++n)+". ");
            System.out.println(getType()+", "+getComfort()+", мест: "+getNumPas());
        }
    }
}
