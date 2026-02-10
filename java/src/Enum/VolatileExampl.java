package Enum;


class VolatileExample{
    volatile boolean running = true;

public class VolatileExampl {
    public static void main(String[] args) throws InterruptedException {
        VolatileExample volatileExample = new VolatileExample();

        new Thread(()->{
            while (volatileExample.running){
                int nums = 0;
                for (int i = 0;i<nums; i++) {

                }
                System.out.println("Thread started..." + nums);
            }
        }).start();
        Thread.sleep(2000);
        volatileExample.running= false;
    }


    }
}
