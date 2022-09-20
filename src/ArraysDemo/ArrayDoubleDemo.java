package ArraysDemo;

public class ArrayDoubleDemo {

    public static void main(String[] args) {

        double[] d = new double[5];

        d[0] = 12.45;
        d[1] = 45.11;
        d[2] = 11.32;
        d[3] = 50.56;
        d[4] = 34.09;

        int l = d.length; // (length is the instance variable)

        // normal for loop

        for (int i=0 ;i<d.length;i++)
            System.out.println(d[i]);

        // for each loop
        
        for(double x:d)
            System.out.println(x);

    }
}
