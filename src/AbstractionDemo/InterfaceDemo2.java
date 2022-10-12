package AbstractionDemo;

public interface InterfaceDemo2 {
    void start();
    void run();
    void display();

   /* default void display() {
        System.out.println("display interface");
    }*/
}

interface AnotherInterface
{
    void display();
}

class ChildInterface2 implements InterfaceDemo2,AnotherInterface
{

    public void start() {
        System.out.println("start");
    }

    public void run() {
        System.out.println("run");
    }

    public void display() {
        System.out.println("display child");
    }

    public static void main(String[] args) {

        InterfaceDemo2 ob = new ChildInterface2();
        ob.display();
        ob.run();
        ob.start();

        AnotherInterface ob2 = new ChildInterface2();
        ob2.display();

    }


}
