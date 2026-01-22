package Oops;


interface paym{
    void payment();

    default void Status(){
        System.out.println("this is default method in interface:");
    }
    static void info(){
        System.out.println("now we are calling Info for payment :");
    }
}
class UpiPayment implements paym{
    @Override
    public void payment(){
        System.out.println("Payment Successfully completed :: Please weit 2 min");
    }
}

public class InterfaceeOops {
    public static void main(String[] args) {
        UpiPayment upi = new UpiPayment();
        upi.payment();
        upi.Status();
       paym.info();
    }
}
