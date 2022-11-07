package CollectionsDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo1 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        System.out.println("capacity="+v.capacity()); // 10
        System.out.println("size="+v.size()); // 0

        v.add("amit");
        v.add("gogul");
        v.add("neelam");
        v.add("amol");
        v.add("abhijit");
        v.add("poojit");
        v.add("hanan");
        v.add("Shivani");
        v.add("hanan");
        v.add("Shivani");
        v.add("Shivani");
        v.add("gogul");
        v.add("neelam");
        v.add("amol");
        v.add("abhijit");
        v.add("poojit");
        v.add("hanan");
        v.add("Shivani");
        v.add("hanan");
        v.add("Shivani");
        v.add("Shivani");


        System.out.println("capacity="+v.capacity()); // 40
        System.out.println("size="+v.size()); // 21

        System.out.println(v);

        System.out.println("Using Iterator................");

        Iterator itr = v.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println("Using Enumeration................");

        Enumeration e = v.elements();

        while (e.hasMoreElements())
            System.out.println(e.nextElement());

    }
}
