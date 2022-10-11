package ClassConstructors.pack2;

import ClassConstructors.pack1.Java1;

import static FinalStatic.StaticMethodDemo.demoStaticMethod1;
import static FinalStatic.StaticMethodDemo.demoStaticMethod2;
import static FinalStatic.StaticMethodDemo.college;


public class Java4 {

    void anotherFuntion()
    {
        demoStaticMethod1();
        demoStaticMethod2();
        college="";
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();

        ob.a = 10 ;


        Java3 j3 = new Java3();
        j3.a =90; // public
       /* j3.d =89.90; // protetced
        j3.c ='j'; // private
        j3.str = "amol"; // default
*/


       demoStaticMethod1();
       demoStaticMethod2();
       college="";
    }
}
