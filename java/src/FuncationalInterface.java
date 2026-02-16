
@FunctionalInterface
interface A{
    public void myinterface();
    int a = 12;


}
interface  B{
    public void YourInterface();
    String str = "Started";
}

class bothInterface implements A,B{

    @Override
    public void myinterface() {
        System.out.println("This is myInterface and count is ...." + a);
    }

    @Override
    public void YourInterface() {
        System.out.println("Your Interface...." + str);

    }
}
public class FuncationalInterface {
    public static void main(String[] args) {

        bothInterface bothInterface = new bothInterface();
        try {
            if (A.a>14){
                System.out.println("This is correct you are Auth");
            }

        }catch (ArithmeticException e){
            System.out.println("your auth failed Please try agine after some time.." + e);
        }finally {

            System.out.println("connected...");
        }

        bothInterface.myinterface();

        bothInterface.YourInterface();

    }
}
