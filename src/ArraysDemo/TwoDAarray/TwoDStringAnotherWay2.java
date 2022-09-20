package ArraysDemo.TwoDAarray;

import java.util.Locale;

public class TwoDStringAnotherWay2 {

    public static void main(String[] args) {

        String[][] str = { {"Abhjit","Amit","Anjali"},
                      {"Poojit","Athulya","Chandan"},
                      {"Deepali","Gogul","Guna"},
                      {"Hanan","Hemant","Mithilesh"},
                      {"Pradeep","Praveen","Preeti"}
                  } ;

        System.out.println(str[0][1].length());
        System.out.println(str[0][1].toUpperCase());

    }
}
