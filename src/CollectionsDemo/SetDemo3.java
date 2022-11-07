package CollectionsDemo;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo3 {

    public static void main(String[] args) {

        TreeSet ts = new TreeSet();

        ts.add("amit");
        ts.add("gogul");
        ts.add("neelam");
        ts.add("amol");
        ts.add("abhijit");
        ts.add("poojit");
        ts.add("hanan");
        ts.add("shivani");
        //ts.add(12);

        System.out.println(ts.add("shivani"));

        System.out.println(ts);
    }
}
