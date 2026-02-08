package Oops;

import java.util.*;
import java.util.stream.Stream;

interface  payment{
    void pay();
    void pay2();
}
class  CreditCardPayment implements payment{
    @Override
    public void pay() {
        System.out.println("Payment done using Credit Card");
    }
    @Override
    public void pay2() {
        System.out.println("Payment done using New Credit Card");
    }
}

public class AbstractionInterface {
    public static void main(String[] args) {
    CreditCardPayment credit = new CreditCardPayment();
    CreditCardPayment credit2 = new CreditCardPayment();
        System.out.println("what your payment status -> ");


//        List<Integer>  newlist = Arrays.asList(87,21,13,42,15);




//        int newsss = Stream.


        Scanner sc = new Scanner(System.in);
        String newss = sc.nextLine();
//        System.out.println("what your payment status -> ");
//        System.out.println("Payment -> " credit.pay());
    credit.pay();
    credit.pay2();

    }
}
