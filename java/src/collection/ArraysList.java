package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysList {
    public static void main(String[] args) {
        List<Integer> Listarr = new ArrayList<>(Arrays.asList(1,2,4,3,4,53,5,35,44,34,32));

        List<String> names = Arrays.asList("java", "spring", "api");

        List<String> newString = names.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(newString);


        Listarr.add(23);
//        Listarr.getFirst().equals(1);
         Listarr.stream()
                 .filter(n->n%2==0)
                 .sorted()
                 .limit(3)
                 .forEach(System.out::println);
    }
}
