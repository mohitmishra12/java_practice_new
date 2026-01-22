package Oops;

abstract class Bank {
    abstract void rateOfInterest();

    void display() {
        System.out.println("Welcome to Bank");
    }
}
class SBI extends Bank{
    void rateOfInterest(){
        System.out.println("SBI Interest Rate is 6.5%");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.display();
        sbi.rateOfInterest();


    }
}
