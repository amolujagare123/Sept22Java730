package controlStructure;

public class FizzBuzz {

    public static void main(String[] args) {
      /*
        Print 1 to 30 numbers
        If number divisible by 3  print  → no  Fizz
        If number divisible by 5  print  → no  Buzz
        If the number is divisible by 3 & 5  print  → no  FizzBuzz
        If the number is not divisible by 3 or 5  print  → no
*/
        for(int i=1;i<=30;i++)
        {

            if (i%3 == 0 && i%5 == 0)
                System.out.println(i+" FizzBuzz");
            else if (i%3 == 0)
                System.out.println(i+" Fizz");
            else if (i%5 == 0)
                System.out.println(i+" Buzz");
            else
                System.out.println(i);
        }
    }
}
