public class Marks {

    public static void main(String[] args) {

        int marks = 54;

        if(marks<40)
            System.out.println("Fail");

        else if (marks>=40 && marks<50)
            System.out.println("pass");

        else if (marks>=50 && marks<60)
            System.out.println("Second class");

        else if (marks>=60 && marks<75)
            System.out.println("First class");

        else if (marks>=75 && marks<=100)
            System.out.println("Distinction");
    }
}
