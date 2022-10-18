package ExceptionHandlingDemos;

public class ExceptionDemo2 {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 12;
        a[1] = 14;
        a[2] = 16;
        a[3] = 18;
        a[4] = 22;
        a[5] = 42;

        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);

        System.out.println("end of the program");
    }
}
