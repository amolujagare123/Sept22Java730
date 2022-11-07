package CollectionsDemo;

import java.util.LinkedList;

public class LinkedListDemo1 {

    public static void main(String[] args) {

        LinkedList<String> ll  = new LinkedList<>();

        ll.add("amit");
        ll.add("gogul");
        ll.add("neelam");
        ll.add("amol");
        ll.add("abhijit");
        ll.add("poojit");
        ll.add("hanan");
        ll.add("Shivani");

        System.out.println(ll);

        ll.addFirst("first");
        ll.addLast("last");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);


    }
}
