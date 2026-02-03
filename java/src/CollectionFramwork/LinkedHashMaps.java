package CollectionFramwork;

import java.util.LinkedHashMap;

public class LinkedHashMaps {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> LinkedHashed = new LinkedHashMap<>();

        LinkedHashed.put(1,"mohit");
        LinkedHashed.put(12,"Rohit");
        LinkedHashed.put(23,"Manish");
        LinkedHashed.put(23,"Shivam");

        System.out.println(LinkedHashed.get(23));


    }
}
