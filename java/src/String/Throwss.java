package String;


import java.io.FileReader;

class TestThrows{
    static void  readFile() throws ArithmeticException{

        FileReader file = new FileReader("abc.txt");

    }

}



public class Throwss {
    public static void main(String[] args) {
        try {
            TestThrows.readFile();
        }
        catch (Exception e){
            System.out.println();
        }


    }
}

