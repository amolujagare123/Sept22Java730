package CollectionsDemo;

import java.util.PriorityQueue;

public class QueueDemo1 {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(45);
        pq.offer(15);
        pq.offer(42);
        pq.offer(35);
        pq.offer(65);
        pq.offer(94);
        pq.offer(77);

        System.out.println(pq); // 15,35,42,45,65,77,94

        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
