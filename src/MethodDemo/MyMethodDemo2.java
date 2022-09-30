package MethodDemo;

public class MyMethodDemo2 {

    int getMyInteger()
    {
        System.out.println("inside get integer");
        int x =77;
        return x;
    }


    public static void main(String[] args) {

        int y ;
        y = 90;

        System.out.println(y);
        int z = y;

        MyMethodDemo2 ob =new MyMethodDemo2();


        System.out.println("ob.getMyInteger()="+ob.getMyInteger());

        int a = ob.getMyInteger();

        System.out.println("a="+a);






    }
}
