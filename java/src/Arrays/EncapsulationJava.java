package Arrays;

class IncapClass {
    private int balance;
    private String name;
    private int age;

    private String mobileNumber;
    private String address;
    private int pincode;

    // New Fields
    private String email;
    private String gender;
    private String city;
    private String state;
    private String country;
    private String accountNumber;
    private String accountType;
    private boolean isActive;
    private double salary;
    private String companyName;

    // Balance
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    // Name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    // Mobile
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    // Address
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    // Pincode
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public int getPincode() {
        return pincode;
    }

    // Email
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    // Gender
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    // City
    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    // State
    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    // Country
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    // Account Number
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    // Account Type
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountType() {
        return accountType;
    }

    // Active Status
    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isActive() {
        return isActive;
    }

    // Salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    // Company Name
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
}

public class EncapsulationJava {
    public static void main(String[] args) {
        IncapClass inc = new IncapClass();

        inc.setName("Mohit");
        inc.setAge(24);
        inc.setBalance(3000);
        inc.setMobileNumber("9876543210");
        inc.setAddress("Delhi, India");
        inc.setPincode(110001);
        inc.setEmail("mohit@gmail.com");
        inc.setGender("Male");
        inc.setCity("Delhi");
        inc.setState("Delhi");
        inc.setCountry("India");
        inc.setAccountNumber("ACC123456");
        inc.setAccountType("Savings");
        inc.setActive(true);
        inc.setSalary(50000);
        inc.setCompanyName("Lycadigital");

        System.out.println("Name: " + inc.getName());
        System.out.println("Age: " + inc.getAge());
        System.out.println("Balance: " + inc.getBalance());
        System.out.println("Mobile: " + inc.getMobileNumber());
        System.out.println("Address: " + inc.getAddress());
        System.out.println("Pincode: " + inc.getPincode());
        System.out.println("Email: " + inc.getEmail());
        System.out.println("Company: " + inc.getCompanyName());
    }
}