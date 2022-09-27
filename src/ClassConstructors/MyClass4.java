package ClassConstructors;

public class MyClass4 {

    int a;
    double d;
    char c;
    String str ; // data members

    MyClass4(int x,double y,char ch,String s) // parameterized constructor
    {
      a = x;
      d = y;
      c = ch;
      str = s;
    }

    void display() // member function (method)
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {


        MyClass4 ob = new MyClass4(12,34.56,'j',"amol");

        ob.display();


    }
}
