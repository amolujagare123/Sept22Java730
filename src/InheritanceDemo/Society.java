package InheritanceDemo;

public class Society {
    int lightBill = 5000;
}

class Apartment extends Society
{
    int lightBill =800;

    void display()
    {
        System.out.println("lightBill="+lightBill);
        System.out.println("lightBill parent ="+super.lightBill);

    }

    public static void main(String[] args) {
        Apartment a = new Apartment();
        a.display();
    }
}
