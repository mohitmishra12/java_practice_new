package Enum;

class myNewThred extends Thread{
public void run(){
    System.out.println("This is my Thread Method .....");
}
    }
    class newThread implements Runnable{
    public void run(){
        System.out.println("This is my Runnable Method....");
    }
}
public class ThreadAndRunnable {
    public static void main(String[] args) throws Exception {
        myNewThred myNewThred = new myNewThred();
        myNewThred.sleep(3000);
        myNewThred.start();

        Thread thread = new Thread(new newThread());
        thread.sleep(2000);
        thread.start();
        System.out.println("Thread Excuation are completed Please check...");
    }
}
