package Task0_3_OOP;

/**
 * Created by koryak on 26.04.2016.
 */
public class Patient implements Comparable<Patient>{
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private String address;
    private String phoneNum;
    private int cardNumber;
    private String diagnosis;
    static int k=0,n=0;
    public Patient(){

    }
    public Patient(int id, String surname, String name, String middleName, String address, String phoneNum, int cardNumber, String diagnosis) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.phoneNum = phoneNum;
        this.cardNumber = cardNumber;
        this.diagnosis = diagnosis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    public void NCard(long p,long s){
        if ((this.getCardNumber()>p)&&(this.getCardNumber()<s)){
            System.out.print((++k)+") ");
            System.out.println("ID:"+getId());
            System.out.print(getSurname()+" ");
            System.out.print(getName()+" ");
            System.out.println(getMiddleName()+" ");
            System.out.println("Адрес:"+getAddress()+" ");
            System.out.println("Телефон: "+getPhoneNum()+" ");
            System.out.println("CardNumber: "+getCardNumber()+" ");
            System.out.println("Диагноз: "+getDiagnosis()+" ");
            System.out.println();

        }


    }
    public void Diagnos(){
        if ((this.getDiagnosis()).equals("Беременность")){
            System.out.print((++n)+") ");
            System.out.println("ID:"+getId());
            System.out.print(getSurname()+" ");
            System.out.print(getName()+" ");
            System.out.println(getMiddleName()+" ");
            System.out.println("Адрес:"+getAddress()+" ");
            System.out.println("Телефон: "+getPhoneNum()+" ");
            System.out.println("CardNumber: "+getCardNumber()+" ");
            System.out.println("Диагноз: "+getDiagnosis()+" ");
            System.out.println();

        }
    }

    @Override
    public int compareTo(Patient o) {
        return this.surname.compareTo(o.surname);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", cardNumber=" + cardNumber +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
