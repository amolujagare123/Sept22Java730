package ExceptionHandlingDemos;

public class ExceptionDemo2 {

    public static void main(String[] args) {

        int[] a = new int[5];

        try {
            a[0] = 12;
            a[1] = 14;
            a[2] = 16;
            a[3] = 18;
            a[4] = 22;
            a[5] = 42;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("");
        }

        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);

        System.out.println("end of the program");
    }
}
