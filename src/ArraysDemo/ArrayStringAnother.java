package ArraysDemo;

public class ArrayStringAnother {

    public static void main(String[] args) {

        String[] str = {"Chandan","Dakshata","Deepali","Gogul","Hanan",
                "Mithilesh","Monika"};

        System.out.println(">>>>> normal for loop");
        for (int i=0; i<str.length;i++)
            System.out.println(str[i]);

        System.out.println(">>>>> for each loop");
        for (String x:str) {
            System.out.println(x);
        }
    }
}
