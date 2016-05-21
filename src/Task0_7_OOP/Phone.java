package Task0_7_OOP;

/**
 * Created by koryak on 27.04.2016.
 */
public class Phone implements Comparable<Phone> {
    private int id;
    private  String surname,name,middleName;
    private String address;
    private Long cardNumber;
    private int deb,cred;
    private float localTime, globalTime;
    static int k=0,l=0,m=0;

    public Phone() {
    }

    public Phone(int id, String surname, String name, String middleName, String address, Long cardNumber, int deb, int cred, float localTime, float globalTime) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.deb = deb;
        this.cred = cred;
        this.localTime = localTime;
        this.globalTime = globalTime;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getAddress() {
        return address;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public int getDeb() {
        return deb;
    }

    public int getCred() {
        return cred;
    }

    public float getLocalTime() {
        return localTime;
    }

    public float getGlobalTime() {
        return globalTime;
    }

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

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setDeb(int deb) {
        this.deb = deb;
    }

    public void setCred(int cred) {
        this.cred = cred;
    }

    public void setLocalTime(float localTime) {
        this.localTime = localTime;
    }

    public void setGlobalTime(float globalTime) {
        this.globalTime = globalTime;
    }
    public void timeLim(float t){
        if (this.getLocalTime()>t){
            System.out.print((++k)+") ");
            System.out.println("ID:"+getId());
            System.out.print(getSurname()+" ");
            System.out.print(getName()+" ");
            System.out.println(getMiddleName()+" ");
            System.out.println("Адрес:"+getAddress()+". ");
            System.out.print("CardNumber: "+getCardNumber()+". ");
            System.out.print("Кредит: "+getCred()+". ");
            System.out.println("Дебет: "+getDeb()+". ");
            System.out.println("Внутренние разговоры: "+getLocalTime()+" мин.сек.");
            System.out.println("Mеждугородние разговоры: "+getGlobalTime()+" мин.сек.");
        }
    }
    public void globalCall(){
        if (this.getGlobalTime()!=0f){
            System.out.print((++l)+") ");
            System.out.println("ID:"+getId());
            System.out.print(getSurname()+" ");
            System.out.print(getName()+" ");
            System.out.println(getMiddleName()+" ");
            System.out.println("Адрес:"+getAddress()+". ");
            System.out.print("CardNumber: "+getCardNumber()+". ");
            System.out.print("Кредит: "+getCred()+". ");
            System.out.println("Дебет: "+getDeb()+". ");
            System.out.println("Внутренние разговоры: "+getLocalTime()+" мин.сек.");
            System.out.println("Mеждугородние разговоры: "+getGlobalTime()+" мин.сек.");
        }
    }
    public void ABCList(){
            System.out.print((++m)+") ");
            System.out.println("ID:"+getId());
            System.out.print(getSurname()+" ");
            System.out.print(getName()+" ");
            System.out.println(getMiddleName()+" ");
            System.out.println("Адрес:"+getAddress()+". ");
            System.out.print("CardNumber: "+getCardNumber()+". ");
            System.out.print("Кредит: "+getCred()+". ");
            System.out.println("Дебет: "+getDeb()+". ");
            System.out.println("Внутренние разговоры: "+getLocalTime()+" мин.сек.");
            System.out.println("Mеждугородние разговоры: "+getGlobalTime()+" мин.сек.");

    }

    @Override
    public int compareTo(Phone o) {
        return this.getSurname().compareTo(o.surname);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber=" + cardNumber +
                ", deb=" + deb +
                ", cred=" + cred +
                ", localTime=" + localTime +
                ", globalTime=" + globalTime +
                '}';
    }
}
