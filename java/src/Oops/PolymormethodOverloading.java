package Oops;

class Calculator {
    int add(int a , int b){
        return  a+b;
    }

    int add (int a , int b , int c){
        return a+b+c;
    }

    double add (double a , double b){
        return a+b;
    }

}
public class PolymormethodOverloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(12,32));
        System.out.println(cal.add(1,32));
        System.out.println(cal.add(12.23,32.54));

    }
}
