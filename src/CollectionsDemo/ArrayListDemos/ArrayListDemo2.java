package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(32);
        al.add(14);
        al.add(42);
        al.add(15);
        al.add(15);

        System.out.println(al);

        System.out.println("Using for loop................");

        for (int i=0; i < al.size();i++)
        {
            System.out.println(al.get(i));
        }

        System.out.println("Using for each loop................");

        for(int a:al)
        {
            System.out.println(a);
        }

    }
}
