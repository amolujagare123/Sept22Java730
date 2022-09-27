package ClassConstructors;

public class MyClass5 {

    int a;
    double d;
    char c;
    String str ; // data members

    MyClass5(int a, double d, char c, String str) {// parameterized constructor with this operator
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }

    void display() // member function (method)
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {


        MyClass5 ob = new MyClass5(12,34.56,'j',"amol");

        ob.display();


    }
}
