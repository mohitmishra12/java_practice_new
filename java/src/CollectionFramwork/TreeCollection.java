package CollectionFramwork;

import java.util.TreeMap;

public class TreeCollection {
    public static void main(String[] args) {

        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"java");
        treeMap.put(2,"Hibernate");
        treeMap.put(3,"Microservices");
        treeMap.put(4,"React.js");

        System.out.println(treeMap.size());
        System.out.println(treeMap.reversed().firstEntry());
    }
}
