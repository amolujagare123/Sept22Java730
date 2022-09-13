import java.util.Scanner;

public class Average {

    public static void main(String[] args)
    {
        double maths;
        double english;
        double history;
        double science;
        double geography;
        double average;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter maths marks = ");
        maths = sc.nextDouble();

        System.out.println("Enter english marks = ");
        english = sc.nextDouble();

        System.out.println("Enter history marks = ");
        history = sc.nextDouble();

        System.out.println("Enter science marks = ");
        science = sc.nextDouble();

        System.out.println("Enter geography marks = ");
        geography = sc.nextDouble();

        average = (maths + english + history + science + geography)/5 ;

        System.out.println("Average = "+average);


    }
}
