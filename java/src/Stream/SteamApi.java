package Stream;


import collection.ArraysList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class SteamApi {
    public static void main(String[] args) {

        List<Integer> Stream = Arrays.asList(9,2,3,12,5,13,7,4,54);
        List<Integer> str = Stream;

//      str.stream().sorted();
        System.out.println(str.remove(2));




    }
}
