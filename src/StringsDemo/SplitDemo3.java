package StringsDemo;

public class SplitDemo3 {

    public static void main(String[] args) {
        String str = "Hey Baby you are so lovely";
        // print only the words that starts with 'y'
        String[] stArr = str.split(" ");

        for (int i=0;i< stArr.length ; i++)
        {
            /*if( stArr[i].charAt(0)=='y' ||  stArr[i].charAt(0)=='Y')
               System.out.println(stArr[i]);*/

            if (stArr[i].startsWith("y"))
                System.out.println(stArr[i]);
        }
    }
}
