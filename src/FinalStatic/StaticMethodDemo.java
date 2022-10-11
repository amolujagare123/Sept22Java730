package FinalStatic;

public class StaticMethodDemo {

    public int rno;
    public String name;
    public static String college="ITC";

    void display() // non static method
    {
        System.out.println("rno="+rno); // non static data member- allowed
        System.out.println("name="+name); // non static data member- allowed
        System.out.println("college="+college); // static data member- allowed
    }

    public static void demoStaticMethod1()
    {
        System.out.println("demoStaticMethod1");
        demoStaticMethod2(); // static method - allowed
        System.out.println("college="+college);// static data member - allowed
       // System.out.println("rno="+rno); // non static data member- not allowed
      //  System.out.println("name="+name); // non static data member- not allowed
       // demoNonStaticMethod(); // non static method- not allowed

    }

    public static void demoStaticMethod2()
    {
        System.out.println("demoStaticMethod2");
    }

     void demoNonStaticMethod()
     {
        System.out.println("demoNonStaticMethod");

        System.out.println("rno="+rno); // non static data member- allowed
        System.out.println("name="+name); // non static data member- allowed
        System.out.println("college="+college); // static data member- allowed
        demoStaticMethod1();// static method - allowed
        demoStaticMethod2(); // static method - allowed
     }


    public static void main(String[] args) {


        StaticMethodDemo.demoStaticMethod1();
        StaticMethodDemo.demoStaticMethod2();
        StaticMethodDemo.college="";


    }
}
