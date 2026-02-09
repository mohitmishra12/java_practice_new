package Enum;

class MyThread extends Thread{
    public void run(){
        System.out.println("Thread are started.....");
    }

}

public class RunableInterface {
    public static void main(String[] args) {
        MyThread  in = new MyThread();
        in.start();

    }
}
