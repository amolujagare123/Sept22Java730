package CollectionsDemo;

import java.util.HashSet;

public class SetDemo1 {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("amit");
        hs.add("gogul");
        hs.add("neelam");
        hs.add("amol");
        hs.add("abhijit");
        hs.add("poojit");
        hs.add("hanan");
        hs.add("Shivani");
        System.out.println(hs.add("Shivani"));

        System.out.println(hs);
    }
}
