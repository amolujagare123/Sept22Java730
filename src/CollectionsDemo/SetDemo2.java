package CollectionsDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo2 {

    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("amit");
        lhs.add("gogul");
        lhs.add("neelam");
        lhs.add("amol");
        lhs.add("abhijit");
        lhs.add("poojit");
        lhs.add("hanan");
        lhs.add("Shivani");
        System.out.println(lhs.add("Shivani"));

        System.out.println(lhs);
    }
}
