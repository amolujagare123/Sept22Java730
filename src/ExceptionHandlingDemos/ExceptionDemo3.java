package ExceptionHandlingDemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo3 {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("D:\\amol1.txt");
        System.out.println("end of the program");
    }
}
