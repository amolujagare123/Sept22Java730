package controlStructure;

public class SwitchCaseDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c;

        String operation = "div1";

        switch (operation)
        {
            case "add" : c = a + b;
                System.out.println("basics.Addition="+c);
                break;

            case "sub" : c = a - b;
                System.out.println("Substraction="+c);
                break;

            case "multi" : c = a * b;
                System.out.println("Multiplication="+c);
                break;

            case "div" : c = a / b;
                System.out.println("Division="+c);
                break;

            default:
                System.out.println("wrong choice");
                break;
        }


    }

}
