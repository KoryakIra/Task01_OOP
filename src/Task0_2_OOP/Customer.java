package Task0_2_OOP;

/**
 * Created by koryak on 26.04.2016.
 */
 class Customer implements Comparable<Customer> {
    private int id;
    private  String surname;
    private String name;
    private String middleName;
    private String address;
   private Long cardNumber;
   private Long accountNumber;
    static int k=0;


    public Customer(){

    }
    public Customer(int id, String surname, String name, String middleName, String address, Long cardNumber, Long accountNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
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

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setId(int id) {this.id = id;
    }

    public void setSurname(String surname) {this.surname = surname;
    }

    public void setName(String name) {this.name = name;
    }

    public void setMiddleName(String middleName) {this.middleName = middleName;
    }

    public void setAddress(String address) {this.address = address;
    }

    public void setCardNumber(Long cardNumber) {this.cardNumber = cardNumber;
    }

    public void setAccountNumber(Long accountNumber) {this.accountNumber = accountNumber;
    }
    public void ABCList(){
        System.out.println("ID:"+getId());
        System.out.print(getSurname()+" ");
        System.out.print(getName()+" ");
        System.out.println(getMiddleName()+" ");
        System.out.println("Адрес:"+getAddress()+" ");
        System.out.println("CardNumber: "+getCardNumber()+" ");
        System.out.println("AccountNumber:"+getAccountNumber()+" ");

    }
    public void NCard(long p,long s){
        if ((this.getCardNumber()>p)&&(this.getCardNumber()<s)){
            System.out.print((++k)+") ");
            System.out.println("ID:"+getId());
            System.out.print(getSurname()+" ");
            System.out.print(getName()+" ");
            System.out.println(getMiddleName()+" ");
            System.out.println("Адрес:"+getAddress()+" ");
            System.out.println("CardNumber: "+getCardNumber()+" ");
            System.out.println("AccountNumber:"+getAccountNumber()+" ");

        }

    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber=" + cardNumber +
                ", accountNumber=" + accountNumber +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        return this.surname.compareTo(o.surname);
    }
}
