package Arrays;

import java.util.Scanner;

public class UserInputScanner {
    public static void main(String[] args) {

        System.out.println("Enter Your Name :");

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int intval = sc.nextInt();
        float ss  = sc.nextFloat();
        boolean bul = sc.nextBoolean();
        System.out.println("my name is -> " + name +  " " +  "and age ->" + intval + "and my salary" + ss + "" + "slaary getting ? " + bul);

    }
}
