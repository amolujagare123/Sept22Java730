package basics;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        int radius;
        double area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius :");
        radius = sc.nextInt();

        area = 3.14 * radius * radius ;

        System.out.println("Radius of a circle="+radius);
        System.out.println("Area of a circle="+area);


    }
}
