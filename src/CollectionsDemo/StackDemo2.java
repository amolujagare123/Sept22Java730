package CollectionsDemo;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        System.out.println(s.empty()); // true

        s.push("amit");
        s.push("gogul");
        s.push("neelam");
        s.push("amol");
        s.push("abhijit");

        System.out.println(s.empty()); // false

        System.out.println(s);


        System.out.println(s.peek());

        System.out.println(s);
    }
}
