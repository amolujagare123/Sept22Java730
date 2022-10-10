package FinalStatic;

public /*final*/ class OverridingDemo {

    /*final*/ void sampleMethod()
    {
       // System.out.println("x="+x);
        System.out.println("Parent Sample");
    }
}

class ChildOverride extends OverridingDemo
{

    void sampleMethod() // overridden method
    {
        System.out.println("ChildOverride Sample");
    }

    public static void main(String[] args) {

    /*    OverridingDemo obj ; // object reference
        OverridingDemo obj1 = new OverridingDemo() ;

        */

        OverridingDemo ob = new ChildOverride();
        ob.sampleMethod();


    }
}
