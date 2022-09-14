public class GreaterNumber2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        if (a>b) {
            System.out.println("a is greater");
            System.out.println("value of a=" + a);
        }
        else if(b>a) {
            System.out.println("b is greater");
            System.out.println("value of b=" + b);
        }
        else if (a==b)
        {
            System.out.println("a & b are equal");
            System.out.println("value of a=" + a);
            System.out.println("value of b=" + b);
        }


    }
}
