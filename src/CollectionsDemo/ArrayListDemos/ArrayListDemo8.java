package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo8 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(32);
        al.add(14);
        al.add(42);
        al.add(15);

        System.out.println("al="+al);

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(12);
        al2.add(32);
        al2.add(14);
        al2.add(40);
        al2.add(10);
        al2.add(11);
        al2.add(13);

        System.out.println("al2="+al2);


        al2.removeAll(al);

        System.out.println("al2="+al2);

    }
}
