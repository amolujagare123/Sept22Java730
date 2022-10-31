package WrapperClassDemo;

public class WrapperClassDemo {

    public static void main(String[] args) {

        int a = 5;
        System.out.println("a="+a);

        Integer ii = new Integer(5); // boxing / wrapping
        System.out.println("ii="+ii);

        Integer ii1 =  5; // auto boxing / auto wrapping
        System.out.println("ii1="+ii1);


        int k = ii.intValue(); // unboxing / unwrapping
        System.out.println("k="+k);

        int k1 = ii;  // auto unboxing / auto unwrapping
        System.out.println("k1="+k1);


    }
}
