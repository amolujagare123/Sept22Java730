package InheritanceDemo.Polymorphism;

public class AdditionOperations {

    int a;
    int b;
    int c;

    void addition()
    {
        c = a + b ;
        System.out.println("c="+c);
    }

    void addition(int x)
    {
        a = x;
        c = a + b ;
        System.out.println("c="+c);
    }

    void addition(int x,int y)
    {
        a = x;
        b = y;
        c = a + b ;
        System.out.println("c="+c);
    }

    void addition(double d1, double d2)
    {
        double result = d1 + d2 ;
        System.out.println("result="+result);
    }

    void addition(double d1, double d2,double d3)
    {
        double result = d1 + d2 + d3;
        System.out.println("result="+result);
    }

    void addition(String s1,String s2)
    {
        String str = s1 + s2 ;
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        AdditionOperations ob = new AdditionOperations();
        ob.addition();
        ob.addition(10);
        ob.addition(10,10);
        ob.addition(10,10,10);
        ob.addition(10.11,23.10);
        ob.addition("Java","Selenium");

    }
}
