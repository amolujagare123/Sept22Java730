package ArraysDemo;

public class ArrayFloatAnother {

    public static void main(String[] args) {

        float[] d = {23.45f,56.78f,11.23f,34.56f,66.87f};

        System.out.println(">>>>> normal for loop");
        for (int i=0; i<d.length;i++)
            System.out.println(d[i]);

        System.out.println(">>>>> for each loop");
        for (float x:d) {
            System.out.println(x);
        }
    }
}
