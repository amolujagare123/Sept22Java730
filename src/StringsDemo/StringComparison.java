package StringsDemo;

public class StringComparison {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
       // System.out.println(a==b);

        String str1 = "amol";
        String str2 = "amol";
       // str1 == str2 ;
        String str3 = "Amol";
        String str4 = "xyz";
        String str5 = new String("amol");

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // false
        System.out.println(str1.equalsIgnoreCase(str3)); // true
        System.out.println(str1.equals(str5)); //

        System.out.println(str1 == str2);

    }
}
