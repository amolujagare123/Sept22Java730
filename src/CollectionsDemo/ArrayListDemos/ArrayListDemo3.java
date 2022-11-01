package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("abc1");
        al.add("abc2");
        al.add("abc3");
        al.add("abc4");
        al.add("abc5");


        System.out.println(al);

        System.out.println("Using for loop................");

        for (int i=0; i < al.size();i++)
        {
            System.out.println(al.get(i));
        }

        System.out.println("Using for each loop................");

        for(String a:al)
        {
            System.out.println(a);
        }

    }
}
