package ExceptionHandlingDemos;

public class ThrowDemo {

    void checkNumber(int n) throws Exception {

        if(n>=1 && n<=10)
            System.out.println("we are safe");
        else
            throw new ArithmeticException("we are in danger");
    }

    public static void main(String[] args) throws Exception {

        int x = 12;

        System.out.println("Start of the program");
        ThrowDemo ob = new ThrowDemo();

        ob.checkNumber(x);

        System.out.println("End of the program");

    }
}
