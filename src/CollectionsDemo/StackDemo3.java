package CollectionsDemo;

import java.util.Stack;

public class StackDemo3 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        s.push("amit");
        s.push("gogul");
        s.push("neelam");
        s.push("amol");
        s.push("abhijit");

        System.out.println(s);

        System.out.println(s.search("abcd")); // -1
        System.out.println(s.search("neelam"));
        System.out.println(s.search("amol"));
        System.out.println(s.search("gogul"));
        System.out.println(s.search("amit"));
    }
}
