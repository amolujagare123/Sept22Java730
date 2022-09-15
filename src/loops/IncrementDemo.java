package loops;

public class IncrementDemo {

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
        System.out.println(a++); // 10
        System.out.println(a); // 11
        System.out.println(++a); // 12
        System.out.println(a); // 12



    }
}
