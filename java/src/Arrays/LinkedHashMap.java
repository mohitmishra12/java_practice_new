package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LinkedHashMap {
    public static void main(String[] args) {

        List<Integer> newlist = new ArrayList();
        newlist.add(122);
        newlist.add(12);
        newlist.add(1);
        newlist.add(192);

        newlist.addFirst(43);
//       Integer sum =  newlist.stream().sorted();
//
        System.out.println(newlist);
    }
}
