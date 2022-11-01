package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(12);
        al.add(32);
        al.add(14);
        al.add(42);
        al.add(15);
        al.add(15.56);
        al.add('j');
        al.add("amol");
        al.add(true);
        al.add(true);

        System.out.println(al);
        System.out.println("size="+al.size());

        System.out.println("Using for loop................");

        for (int i=0; i < al.size();i++)
        {
            System.out.println(al.get(i));
        }

        System.out.println("Using for each loop................");

        for(Object a:al)
        {
            System.out.println(a);
        }

        System.out.println("Using Iterator................");

        Iterator itr = al.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());

    }
}
