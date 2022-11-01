package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo7 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(32);
        al.add(14);
        al.add(42);
        al.add(15);
        al.add(15);

        System.out.println(al);

        Integer ii = new Integer(32); // boxing /wrapping
        Integer ii1 =32; // auto boxing /auto wrapping

        al.remove(ii1);

        System.out.println(al);



    }
}
