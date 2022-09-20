package ArraysDemo;

public class ArrayDoubleAnother {

    public static void main(String[] args) {

        double[] d = {23.45,56.78,11.23,34.56,66.87};

        System.out.println(">>>>> normal for loop");
        for (int i=0; i<d.length;i++)
            System.out.println(d[i]);

        System.out.println(">>>>> for each loop");
        for (double x:d) {
            System.out.println(x);
        }
    }
}
