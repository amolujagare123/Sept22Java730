package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo5 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(32);
        al.add(14);
        al.add(42);
        al.add(15);
        al.add(15);

        System.out.println(al);

        al.set(3,100);

        System.out.println(al);

        /*al.clear();
        System.out.println(al);*/


    }
}
