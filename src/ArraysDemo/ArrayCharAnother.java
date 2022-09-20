package ArraysDemo;

public class ArrayCharAnother {

    public static void main(String[] args) {

        char[] a = {'t','6','t','7','u','i','q'};

        System.out.println(">>>>> normal for loop");
        for (int i=0; i<a.length;i++)
            System.out.println(a[i]);

        System.out.println(">>>>> for each loop");
        for (char x:a) {
            System.out.println(x);
        }
    }
}
