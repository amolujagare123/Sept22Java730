package InheritanceDemo;

public class Employee {

    /*private*/  int salary = 25000;

    void empDisplay()
    {
        System.out.println("empDisplay");
    }
}

class Programmer extends Employee
{
    int bonus =5000;

    void proDisplay()
    {
        System.out.println("proDisplay");
    }

    public static void main(String[] args) {

        Programmer p = new Programmer();
        System.out.println(p.bonus);
        p.proDisplay();

        System.out.println(p.salary);
        p.empDisplay();
    }
}
