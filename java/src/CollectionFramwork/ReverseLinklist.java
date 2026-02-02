package CollectionFramwork;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinklist {
    public static void main(String[] args) {

        List<Integer> reverse = new LinkedList<>();
        reverse.add(1);
        reverse.add(12);
        reverse.add(14);
        reverse.add(15);
        reverse.add(18);

        System.out.println(reverse.reversed());
    }
}
