package CollectionFramwork;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {

        Map<Integer,String> MapValue = new HashMap<>();

        MapValue.put(1,"mohit");
        MapValue.put(2,"Rohit");
        MapValue.put(3," ");
        MapValue.put(4,"abhishek");
        MapValue.put(4,"abhishek");

        System.out.println(MapValue.get(3));
        System.out.println(MapValue.size());
        System.out.println(MapValue.isEmpty());
    }
}
