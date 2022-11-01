package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo6 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("abc1");
        al.add("abc2");
        al.add("abc3");
        al.add("abc4");
        al.add("abc5");

        System.out.println(al);

       // al.remove(3);
        al.remove("abc3");

        System.out.println(al);



    }
}
