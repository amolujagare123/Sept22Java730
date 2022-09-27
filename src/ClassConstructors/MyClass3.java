package ClassConstructors;

public class MyClass3 {

    int a;
    double d;
    char c;
    String str ; // data members

    MyClass3()
    {
      a = 89;
      d = 23.45;
      c = 'j';
      str = "JAVA";
    }

    void display() // member function (method)
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {


        MyClass3 ob = new MyClass3();
        ob.display();

        MyClass3 ob2 = new MyClass3();
        ob2.a = 101 ;
        ob2.d = 718.65;
        ob2.c = 'j';
        ob2.str = "Selenium" ;

        ob2.display();


    }
}
