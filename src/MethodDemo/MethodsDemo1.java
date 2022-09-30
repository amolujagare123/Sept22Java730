package MethodDemo;

import ClassConstructors.MyClassSample;

public class MethodsDemo1 {

    void display() // no arguments
    {
        System.out.println("this is display");
    }

    void methodDemo1(int a) // single / primitive
    {
        System.out.println("this is method demo1");
        System.out.println("a="+a);
    }

    void methodDemo2(int a,int b,int c) // multiple / primitive / same types
    {
        System.out.println("this is method demo1");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }

    void methodDemo3(int a,double b,char c,String s) // multiple / primitive +non primitive/ different types
    {
        System.out.println("this is method demo1");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("S="+s);
    }

    void displayArray(int[] a)
    {
        System.out.println("Printing Array .....");
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");

        System.out.println();
    }

    void displayTwoDArray(String[][] stArr)
    {
        System.out.println("Printing 2 Dimensional Array .....");
        for (int i=0;i<stArr.length;i++)
        {
            for (int j=0;j<stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+" ");
            }
            System.out.println();
        }

    }


    void displaySampleClassMembers(MyClassSample obj)
    {
        System.out.println("Printing MyClassSample Class members .....");

        System.out.println("a="+obj.a);
        System.out.println("d="+obj.d);
        System.out.println("c="+obj.c);
        System.out.println("str="+obj.str);
    }


    public static void main(String[] args) {

        MethodsDemo1 ob = new MethodsDemo1();
        ob.display();
        ob.methodDemo1(56);
        ob.methodDemo2(2,4,5);
        ob.methodDemo3(2,3.4,'u',"java");


        int[] x = {34,67,45,999,12,77,55};

        ob.displayArray(x);

        String[][] st = {
                {"abc1","pqr1","xyz1"},
                {"abc2","pqr2","xyz2"},
                {"abc3","pqr3","xyz3"},
                {"abc4","pqr4","xyz4"},
                {"abc5","pqr5","xyz5"},
           };

        ob.displayTwoDArray(st);


        MyClassSample myClassSample = new MyClassSample();

        myClassSample.a = 10;
        myClassSample.d = 8.9;
        myClassSample.c ='k';
        myClassSample.str = "amol";

        ob.displaySampleClassMembers(myClassSample);




    }
}
