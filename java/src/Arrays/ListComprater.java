package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListComprater {
    public static void main(String[] args) {

        List<String> newList = Arrays.asList("Spring","java", "microservicess");
        newList.sort((a,b)->b.length()- a.length());
        System.out.println(newList);


        List<Integer> newInt = Arrays.asList(1,43,65,888,34);
        newInt.sort((a,b)->b- a);
        System.out.println(newInt);
    }
}
