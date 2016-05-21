package Task0_4_OOP;

/**
 * Created by koryak on 26.04.2016.
 */
public class Abiturient implements Comparable<Abiturient> {
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private String address;
    private String phoneNum;
    private int ukr;
    private int mat;
    private int eng;
    static int n=0,m=0,l=0,k=0;
    static int seats=5;
    static int seats2=5;
    static int s=15;


    public Abiturient() {
    }

    public Abiturient(int id, String surname, String name, String middleName, String address, String phoneNum, int ukr, int mat, int eng) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.phoneNum = phoneNum;
        this.ukr = ukr;
        this.mat = mat;
        this.eng = eng;
    }

    public int getId() {
        return id;}
    public String getSurname() {
        return surname;}
    public String getName() {
        return name;}
    public String getMiddleName() {
        return middleName;}
    public String getAddress() {
        return address;}
    public String getPhoneNum() {
        return phoneNum;}
    public int getUkr() {
        return ukr;}
    public int getMat() {
        return mat;}
    public int getEng() {
        return eng;}

    public void setId(int id) {
        this.id = id;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    public void setUkr(int ukr) {
        this.ukr = ukr;
    }
    public void setMat(int mat) {
        this.mat = mat;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }
public void unsatisfactory(int p){
    if ((this.getMat()<p)||(this.getUkr()<p)||(this.getEng()<p)){
        System.out.println((++n)+") ");
        System.out.println("ID "+getId());
        System.out.print(getSurname()+" ");
        System.out.print(getName()+" ");
        System.out.println(getMiddleName()+" ");
        System.out.println("Адрес: "+getAddress());
        System.out.println("Телефон: "+getPhoneNum()+" ");
        System.out.print("Оценки: ");
        System.out.print("Укр.мова - \""+getUkr()+"\". ");
        System.out.print("Матем. - \""+getMat()+"\". ");
        System.out.println("Англ.мова - \""+getEng()+"\". ");
        System.out.println();

    }
}
    public void good(int g ){
        if ((this.getEng()+this.getMat()+this.getUkr())>g){
            System.out.println(++m+")");
            System.out.println("ID "+getId());
            System.out.print(getSurname()+" ");
            System.out.print(getName()+" ");
            System.out.println(getMiddleName()+" ");
            System.out.println("Адрес: "+getAddress());
            System.out.println("Телефон: "+getPhoneNum()+" ");
            System.out.print("Оценки: ");
            System.out.print("Укр.мова - \""+getUkr()+"\". ");
            System.out.print("Матем. - \""+getMat()+"\". ");
            System.out.println("Англ. мова - \""+getEng()+"\". ");
            System.out.println();

        }
    }
    public void sumMax(){

        if ((((this.getUkr()+this.getEng()+this.getMat())==this.s))&&( seats>0)){

            System.out.println(++l+")");
            System.out.println("ID "+getId());
            System.out.print(getSurname()+" ");
            System.out.print(getName()+" ");
            System.out.println(getMiddleName()+" ");
            System.out.println("Адрес: "+getAddress());
            System.out.println("Телефон: "+getPhoneNum()+" ");
            System.out.print("Оценки: ");
            System.out.print("Укр.мова - \""+getUkr()+"\". ");
            System.out.print("Матем. - \""+getMat()+"\". ");
            System.out.println("Англ. мова - \""+getEng()+"\". ");
            System.out.println();
                seats--;
        }
    }
    public void sumSat(){
        if ((((this.getUkr()+this.getEng()+this.getMat())>=this.s-1))&&( seats2>=0)){

            System.out.println();
            System.out.println(++k+")");
            System.out.println("ID "+getId());
            System.out.print(getSurname()+" ");
            System.out.print(getName()+" ");
            System.out.println(getMiddleName()+" ");
            System.out.println("Адрес: "+getAddress());
            System.out.println("Телефон: "+getPhoneNum()+" ");
            System.out.print("Оценки: ");
            System.out.print("Укр.мова - \""+getUkr()+"\". ");
            System.out.print("Матем. - \""+getMat()+"\". ");
            System.out.println("Англ. мова - \""+getEng()+"\". ");
            System.out.println();
            seats2--;

        }
    }
    public void sumPP(){
        if ((((this.getUkr()+this.getEng()+this.getMat())==this.s-2))&&( seats2>0)){

            System.out.println(++k+")");
            System.out.println("ID "+getId());
            System.out.print(getSurname()+" ");
            System.out.print(getName()+" ");
            System.out.println(getMiddleName()+" ");
            System.out.println("Адрес: "+getAddress());
            System.out.println("Телефон: "+getPhoneNum()+" ");
            System.out.print("Оценки: ");
            System.out.print("Укр.мова - \""+getUkr()+"\". ");
            System.out.print("Матем. - \""+getMat()+"\". ");
            System.out.println("Англ. мова - \""+getEng()+"\". ");
            System.out.println();
        }

    }
    @Override
    public int compareTo(Abiturient o) {
        return this.surname.compareTo(o.surname);
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", ukr=" + ukr +
                ", mat=" + mat +
                ", eng=" + eng +
                '}';
    }
}


