package Oops;

class DisplayFinal{
    final int MAX_SPPED = 12;

    void Display (){
        System.out.println(MAX_SPPED);
    }
}


public class FinalVariableDemo {
    public static void main(String[] args) {
        DisplayFinal newDis = new DisplayFinal();
        newDis.Display();

    }
}
