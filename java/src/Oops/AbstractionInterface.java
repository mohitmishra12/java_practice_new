package Oops;
interface  payment{
    void pay();
}
class  CreditCardPayment implements payment{
    @Override
    public void pay() {
        System.out.println("Payment done using Credit Card");
    }
}

public class AbstractionInterface {
    public static void main(String[] args) {
    CreditCardPayment credit = new CreditCardPayment();
    credit.pay();

    }
}
