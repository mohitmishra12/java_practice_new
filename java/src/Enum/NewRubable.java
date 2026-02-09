package Enum;

class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Rubable Thread are Started...");
    }
}

public class NewRubable {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
