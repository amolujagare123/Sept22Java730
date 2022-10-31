package WrapperClassDemo;

public class Conversion {

    public static void main(String[] args) {

        String s1 = "23";
        String s2 = "25";
        System.out.println(s1+s2);

        int a1 = Integer.parseInt(s1);
        int a2 = Integer.parseInt(s2);
        System.out.println(a1+a2);

        String s3 = "23.45";
        String s4 = "25.67";
        System.out.println(s1+s2);

        Double d1 = Double.parseDouble(s3);
        Double d2 = Double.parseDouble(s4);
        System.out.println(d1+d2);

        Float f1 = Float.parseFloat(s3);
        Float f2 = Float.parseFloat(s4);
        System.out.println(f1+f2);

        String s5 = "f";

        // covert into char
        //char c = Character.parseCharater()

       // char c = s5;



    }
}
