package ArraysDemo.TwoDAarray;

public class TwoDStringAnotherWay {

    public static void main(String[] args) {

        String[][] str = { {"Abhjit","Amit","Anjali"},
                      {"Poojit","Athulya","Chandan"},
                      {"Deepali","Gogul","Guna"},
                      {"Hanan","Hemant","Mithilesh"},
                      {"Pradeep","Praveen","Preeti"}
                  } ;

        int row = str.length;
        int col = str[0].length;
        System.out.println("row="+row);
        System.out.println("col="+col);

        for (int i=0;i<str.length;i++)
        {
            for (int j=0;j<str[0].length;j++ ) {
                System.out.print(str[i][j] + "\t");
            }

            System.out.println();
        }

    }
}
