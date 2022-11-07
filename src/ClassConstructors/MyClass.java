package ClassConstructors;

public class MyClass {

    int a;
    double d;
    char c;
    String str ; // data members

    void display() // member function (method)
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        int x ;
        x = 10;

        MyClass ob = new MyClass();
        ob.a = 10 ;
        ob.d = 78.65;
        ob.c = 'g';
        ob.str = "amol" ;
        ob.display();

        MyClass ob2 = new MyClass();

        MyClass ob3;



        ob2.a = 101 ;
        ob2.d = 718.65;
        ob2.c = 'j';
        ob2.str = "Selenium" ;
        ob2.display();

        MyClass obj;
    }
}
