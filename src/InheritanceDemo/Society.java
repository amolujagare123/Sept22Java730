package InheritanceDemo;

public class Society {
    int lightBill = 5000;

    Society()
    {
        System.out.println("Super class constructor");
    }

    Society(int a)
    {
        System.out.println("a="+a);
        System.out.println("Super class constructor");
    }

    void sampleMethod()
    {
        System.out.println("Parent class sample method");
    }
}

class Apartment extends Society
{

    Apartment()
    {
        super(10);
        System.out.println("Child class constructor");
    }

    int lightBill =800;

    void sampleMethod()
    {
        System.out.println("Child class sample method");
    }

    void display()
    {
        System.out.println("lightBill="+lightBill);
        System.out.println("lightBill parent ="+super.lightBill);
        super.sampleMethod();
    }

    public static void main(String[] args) {
        Apartment a = new Apartment();
    //    a.display();
    }
}
