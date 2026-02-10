package Enum;


class JoinExampl2 extends Thread{
    public void run(){
        for(int i=1;i<=3;i++)


        System.out.println("Thread are started....");

    }

}

public class JoinExample {
    public static void main(String[] args)throws Exception {
        JoinExampl2 joinExampl2 = new JoinExampl2();
        joinExampl2.start();
        joinExampl2.join();

        Thread.sleep(5000);

        System.out.println("Thread are joined..");

    }
}
