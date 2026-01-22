package Oops;
class parents{
    int value = 100;
}

class child extends parents{
    int value = 200;

    void Display(){
        System.out.println(value);
        System.out.println(super.value);
    }
}
public class SuperVariableDemo {
    public static void main(String[] args) {

        child chi = new child();
        chi.Display();


    }
}
