package ArraysDemo;

public class ArrayIntDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 12;
        a[1] = 45;
        a[2] = 11;
        a[3] = 50;
        a[4] = 34;

   /*   System.out.println(a[3]);

        for (int i=0 ;i<5;i++)
            System.out.println(a[i]);*/

        // for each loop
        
        for(int x:a)
            System.out.println(x);

    }
}
