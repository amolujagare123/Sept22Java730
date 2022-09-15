package loops;

public class DecrementDemo {

    public static void main(String[] args) {

        int a = 10;
        /*a - - / a++ (post-operator) :
        -  first statement will be executed
        -  then increment / decrement happens

        ++a / - - a (pre-operator)
        -  first increment / decrement happens
        -  then statement will be executed
      */
        System.out.println(a); // 10
        System.out.println(a--); // 10
        System.out.println(a); // 9
        System.out.println(--a); // 8
        System.out.println(a); // 8



    }
}
