package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo4 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        System.out.println(al.isEmpty()); // true

        al.add(12);
        al.add(32);
        al.add(14);
        al.add(42);
        al.add(15);
        al.add(15);

        System.out.println(al.isEmpty()); // false

        System.out.println("al="+al);

        ArrayList<Integer> al2 = new ArrayList<>();

        al2.add(88);
        al2.add(89);

        System.out.println(al2.isEmpty()); // true

        System.out.println("al2="+al2);

        al2.addAll(al);

        System.out.println("al2="+al2);


    }
}
