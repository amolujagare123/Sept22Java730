package ArraysDemo;

public class ArrayCharDemo {

    public static void main(String[] args) {

        char[] ch = new char[5];

        ch[0] = 't';
        ch[1] = 'y';
        ch[2] = 'u';
        ch[3] = 'i';
        ch[4] = 'r';

        int l = ch.length; // (length is the instance variable)

        // normal for loop

        System.out.println(">>>>> normal for loop");
        for (int i=0 ;i<ch.length;i++)
            System.out.println(ch[i]);

        // for each loop
        System.out.println(">>>>> for each loop");
        for(char x:ch)
            System.out.println(x);

    }
}
