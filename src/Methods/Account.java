package Methods;


public class Account {

    private String name;

    private int age;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", EMail='" + EMail + '\'' +
                ", Password=" + Password +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", DOB='" + DOB + '\'' +
                '}';
    }

    private String EMail;

    public double getPassword() {
        return Password;
    }

    public void setPassword(double password) {
        Password = password;
    }

    public String getEMail() {
        return EMail;
    }

    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

    private double Password;

    public Account(String name, int age, String address, String phoneNumber, String DOB,String EMail,double password) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.DOB = DOB;
        this.EMail = EMail;
        this.Password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    private String address;
    private String phoneNumber;
    private String DOB;
}