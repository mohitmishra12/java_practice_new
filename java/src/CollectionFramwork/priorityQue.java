package CollectionFramwork;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQue {
    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(12);
        queue.add(64);
        queue.add(95);
        queue.add(87);
        queue.add(23);

//       queue.offer(3);

        System.out.println(queue.offer(9));

    }
}
