package ArraysDemo;

public class ArrayStringAnother {

    public static void main(String[] args) {

        String[] stArr = {"Chandan","Dakshata","Deepali","Gogul","Hanan",
                "Mithilesh","Monika"};

        System.out.println(">>>>> normal for loop");
        for (int i=0; i<stArr.length;i++)
            System.out.println(stArr[i]);

        System.out.println(">>>>> for each loop");
        for (String x:stArr) {
            System.out.println(x);
        }
    }
}
