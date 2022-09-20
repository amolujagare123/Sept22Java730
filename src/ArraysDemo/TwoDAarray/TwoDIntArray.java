package ArraysDemo.TwoDAarray;

public class TwoDIntArray {

    public static void main(String[] args) {

        int[][] a = new int[5][3];

        a[0][0] = 89;
        a[0][1] = 83;
        a[0][2] = 87;

        a[1][0] = 79;
        a[1][1] = 73;
        a[1][2] = 77;

        a[2][0] = 69;
        a[2][1] = 63;
        a[2][2] = 67;

        a[3][0] = 59;
        a[3][1] = 53;
        a[3][2] = 57;

        a[4][0] = 49;
        a[4][1] = 43;
        a[4][2] = 47;

        int row = a.length;
        int col = a[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);


       /* for (int i=0;i<5;i++) // rows
        {
            for (int j=0;j<3;j++) // col
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }*/


        for (int i=0;i<a.length;i++) // rows
        {
            for (int j=0;j<a[0].length;j++) // col
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
