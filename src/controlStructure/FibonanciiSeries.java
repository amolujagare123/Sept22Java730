package controlStructure;

public class FibonanciiSeries {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int sum = 0;
        int n = 8;

       System.out.print(a+" "+b); // 0   1
        for( int i=3 ;i<=n;i++) // iterate for loop n-2 times
       // for( int i=1 ;i<=n-2;i++) // iterate for loop n-2 times
        {
            sum = a + b;
            System.out.print(" " + sum);

            a = b;
            b = sum;
        }

    }
}
