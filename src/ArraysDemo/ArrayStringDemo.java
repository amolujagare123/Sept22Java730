package ArraysDemo;

public class ArrayStringDemo {

    public static void main(String[] args) {

        String[] str = new String[5];

        str[0] = "Abhijit";
        str[1] = "Amit";
        str[2] = "Anjali";
        str[3] = "Poojit";
        str[4] = "Athulya";

        int l = str.length; // (length is the instance variable)

        System.out.println("length of array ="+l);
        System.out.println("length of array ="+str.length);
        // normal for loop

        System.out.println(">>>>> normal for loop");
        for (int i = 0; i< str.length; i++)
            System.out.println(str[i]);

        // for each loop
        System.out.println(">>>>> for each loop");
        for(String x: str)
            System.out.println(x);

    }
}
