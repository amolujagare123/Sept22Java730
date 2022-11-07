package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo10 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amit");
        al.add("gogul");
        al.add("neelam");
        al.add("amol");
        al.add("abhijit");
        al.add("poojit");
        al.add("hanan");
        al.add("Shivani");

        System.out.println(al);

        // remove elements which starts with a
       // al.removeIf(str -> str.startsWith("a"));

      //  al.removeIf(a -> a.charAt(0)=='a');


      //  System.out.println(al);

        // remove elements whose length is greater than 5

        al.removeIf(str  -> str.length() > 5 );
        System.out.println(al);




    }
}
