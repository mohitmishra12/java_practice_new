package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkList {
    public static void main(String[] args) {

        List<String> LinkListt = new LinkedList<>();
      LinkListt.addLast("mohit");
        if (LinkListt == null) {
            System.out.println("Please enter");

        }else {
            System.out.println("Please go");
        }
      LinkListt.add("Rohit");
      LinkListt.add("mohit");
      List news = LinkListt.stream().map(String::toUpperCase).toList();
        System.out.println(news);
        System.out.println(LinkListt);

    }
}
