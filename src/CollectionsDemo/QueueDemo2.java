package CollectionsDemo;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueDemo2 {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(45);
        adq.offer(15);
        adq.offer(42);
        adq.offer(35);
        adq.offer(65);
        adq.offer(94);
        adq.offer(77);

        System.out.println(adq);

        adq.offerFirst(0);
        adq.offerLast(100);

        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);

    }
}
