package ExceptionHandlingDemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo3 {

    public static void main(String[] args) throws FileNotFoundException {

        //try {
            FileInputStream fis = new FileInputStream("D:\\amol1.txt");
        /*}
        catch (Exception e)
        {
            e.printStackTrace();
        }*/

        System.out.println("end of the program");
    }
}
