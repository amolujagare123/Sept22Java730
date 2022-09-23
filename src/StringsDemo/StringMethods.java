package StringsDemo;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Selenium is an automation testing tool";

        System.out.println(str.startsWith("Sel")); //true
        System.out.println(str.endsWith("tool")); // true
        System.out.println(str.contains("t")); // true

    }
}
