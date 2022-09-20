package ArraysDemo;

public class ArrayIntAnother {

    public static void main(String[] args) {

        int[] a = {34,56,21,45,12,78,90,12,45,78,22,34};

        System.out.println(">>>>> normal for loop");
        for (int i=0; i<a.length;i++)
            System.out.println(a[i]);

        System.out.println(">>>>> for each loop");
        for (int x:a) {
            System.out.println(x);
        }
    }
}
