package collection;

import java.util.HashSet;

public class HashSetCillection {
    public static void main(String[] args) {

        HashSet<Integer> newhashset = new HashSet<>();

        newhashset.add(1);
        newhashset.add(1);
        newhashset.add(12);
        newhashset.add(13);
        newhashset.add(12);


       int ss = newhashset.size();
       System.out.println(ss);
    }
}
