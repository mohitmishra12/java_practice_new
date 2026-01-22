package Oops;

import java.util.Scanner;

class  Vehicle  {
    int a = 12;
    int b= 23;
    String ne = "mohit";
    void start(){
        System.out.println("my car started Please give me side : ");
    }
}
class newcar extends Vehicle{
    void drive(){
        System.out.println("i'am driving my car :"+ ne);
    }
}

public class Inhertence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("where are you from can u give me your address::");
        sc.nextInt();
        newcar newcarr = new newcar();

        newcarr.drive();
        newcarr.start();

    }
}
