package AbstractionDemo;

public abstract class AbstractClass {

    abstract void run();//abstract method
    abstract void start();//abstract method

    void display()
    {
        System.out.println("this is display");
    }

}

class ChildAbstract extends AbstractClass {

   void run()
    {
        System.out.println("run");
    }

   void start()
    {
        System.out.println("start");
    }

    public static void main(String[] args) {

       AbstractClass ob = new ChildAbstract();
       // ob --> object reference of parent class
       ob.run();
       ob.start();
       ob.display();
    }

}
