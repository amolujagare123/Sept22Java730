package ArraysDemo;

public class ArrayFloatDemo {

    public static void main(String[] args) {

        float[] d = new float[5];

        d[0] = 12.45f;
        d[1] = 45.11f;
        d[2] = 11.32f;
        d[3] = 50.56f;
        d[4] = 34.09f;

        int l = d.length; // (length is the instance variable)

        // normal for loop

        for (int i=0 ;i<d.length;i++)
            System.out.println(d[i]);

        // for each loop
        
        for(float x:d)
            System.out.println(x);

    }
}
