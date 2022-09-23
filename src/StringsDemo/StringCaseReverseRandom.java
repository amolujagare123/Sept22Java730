package StringsDemo;

public class StringCaseReverseRandom {

    public static void main(String[] args) {

        String str = "This is My NAME";
        String strConverted="";
        char ch;

        System.out.println(str);
        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
                System.out.print(" ");
            if(str.charAt(i)>=65 &&  str.charAt(i)<=90) // for uppercase to lowercase
            {
                int temp = str.charAt(i) + 32;
                ch = (char) temp;
                System.out.print(ch);
            }

            else if(str.charAt(i)>=97 &&  str.charAt(i)<=122) // for uppercase to lowercase
            {
                int temp = str.charAt(i) - 32;
                ch = (char) temp;
                System.out.print(ch);
            }


        }
    }
}
