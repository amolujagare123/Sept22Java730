package ClassConstructors.pack1;

public class Java1 {

    public int a;
    protected double d;
    private char c;
    String str ; // data members

    void display() // member function (method)
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();
        ob.a = 10 ;
        ob.d = 78.65;
        ob.c = 'g';
        ob.str = "amol" ;
        ob.display();
    }
}
