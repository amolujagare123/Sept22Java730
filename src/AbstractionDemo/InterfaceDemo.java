package AbstractionDemo;

public interface InterfaceDemo {

    void start();
    void run();

    default void display1()
    {
        System.out.println("this is display1");
    }

    static void display2()
    {
        System.out.println("this is display2");
    }

    private void display3()
    {
        System.out.println("this is display3");
    }
}

class ChildInterface implements InterfaceDemo
{
     public void run()
     {
        System.out.println("run");
     }

    public void start()
    {
        System.out.println("start");
    }
}
