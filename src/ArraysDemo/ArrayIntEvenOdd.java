package ArraysDemo;

public class ArrayIntEvenOdd {

    public static void main(String[] args) {

        // even odd
        int[] a = {34,56,21,45,12,78,90,12,45,78,22,34};

        for (int i=0; i<a.length;i++) {

            if(a[i]%2 == 0)
               System.out.println(a[i]+" Even");
            else
                System.out.println(a[i]+" Odd");
        }

    }
}
