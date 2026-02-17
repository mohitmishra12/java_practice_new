package CollectionFramwork;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMaps {
    public static void main(String[] args) {

        ConcurrentHashMap<String,Integer> concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("A",1);
        concurrentHashMap.put("B",2);
        concurrentHashMap.put("C",3);
        concurrentHashMap.put("D",4);

//        ConcurrentHashMap.newKeySet("E",5).add(6)

        System.out.println(concurrentHashMap.get("C").equals("D"));
    }
}
