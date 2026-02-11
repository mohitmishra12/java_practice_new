public class ExceptionHandling {
    public static void main(String[] args) {

        int a = 12;
        int b = 10;

        try {
            int ans = a/b;
            System.out.println("answer: " + ans);
        }catch (ArithmeticException e){
            System.out.println("Program are getting error");

        }
        finally{
            System.out.println("This block always executes.");
        }
        System.out.println("Program continues...");

    }
}
