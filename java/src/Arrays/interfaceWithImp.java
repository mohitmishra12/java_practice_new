package Arrays;

import java.util.Scanner;

interface workable{
     void myMethod();

}
interface Eatable{
    void myMethod2();
}


class Human implements workable,Eatable{

    public void myMethod() {
        System.out.println("MyMethod are Running...");

    }


    public void myMethod2() {
        System.out.println("My 2nd Method are Running....");
    }

}
public class interfaceWithImp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String scc  = sc.nextLine();
        System.out.println("Please Enter in Which Method You Call....");

        Human human = new Human();
        human.myMethod();
        human.myMethod2();


    }
}
