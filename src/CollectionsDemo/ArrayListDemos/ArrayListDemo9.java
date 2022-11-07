package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo9 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(32);
        al.add(14);
        al.add(42);
        al.add(15);
        al.add(64);
        al.add(49);
        al.add(19);

        System.out.println("al="+al);

        // remove elements less that 20
        // a -> a<20

     //   al.removeIf(x -> x<20); // -> predicate symbol

     //   System.out.println("al="+al);


        // remove elements Which are even number

        al.removeIf(a -> a%2==0);
        System.out.println("al="+al);







    }
}
