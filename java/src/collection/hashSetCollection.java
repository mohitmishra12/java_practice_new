package collection;

import java.util.HashSet;
import java.util.Set;

public class hashSetCollection {
    public static void main(String[] args) {

        Set<Integer> newHashSet = new HashSet<>();
        newHashSet.add(11);
        newHashSet.add(12);
        newHashSet.add(13);
        newHashSet.add(11);
        newHashSet.add(14);

        System.out.println(newHashSet.size());

    }
}
