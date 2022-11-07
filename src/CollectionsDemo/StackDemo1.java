package CollectionsDemo;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        s.push("amit");
        s.push("gogul");
        s.push("neelam");
        s.push("amol");
        s.push("abhijit");

        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
       // System.out.println(s.pop());

        System.out.println(s);
    }
}
