package MethodDemo;

import ClassConstructors.MyClassSample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyMethodDemo2 {

    int getMyInteger()
    {
       // System.out.println("inside get integer");
        int x =77;
        return x;
    }


    String getTheFileName()
    {
        Date date = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("_yyyyddMM_hhmmss");
        String dateStr =  sd.format(date);
        String fileName = "IMG"+dateStr;

        return fileName;

     //  return "IMG" + new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());
    }


    int[] getTheArray()
    {
        int[] a = {45,67,24,11,56,78,90,11};
        return a;
    }

    String[][] getTwoDArray()
    {
        String[][] str = { {"Abhjit","Amit","Anjali"},
                {"Poojit","Athulya","Chandan"},
                {"Deepali","Gogul","Guna"},
                {"Hanan","Hemant","Mithilesh"},
                {"Pradeep","Praveen","Preeti"}
        } ;

        return str;
    }


    MyClassSample setMyObject()
    {
        MyClassSample obj = new MyClassSample();

        obj.a =90;
        obj.d= 32.45;
        obj.c = 'j';
        obj.str = "amol";

        return obj;

    }

    public static void main(String[] args) {

        int y ;
        y = 90;

        System.out.println("y="+y);
        int z = y;

        MyMethodDemo2 ob =new MyMethodDemo2();

        System.out.println("ob.getMyInteger()="+ob.getMyInteger());

        int a = ob.getMyInteger();

        System.out.println("a="+a);

        System.out.println("printing the random filename");
        System.out.println(ob.getTheFileName());

        String str = ob.getTheFileName();
        System.out.println("str="+str);


        int[] x=ob.getTheArray();

        System.out.println("printing array x...");

        for (int i=0;i<x.length;i++)
        {
            System.out.print(x[i]+" ");
        }

        System.out.println();

        String[][] stArr = ob.getTwoDArray();

        System.out.println("Printing 2 D Array");

        for (int i=0;i< stArr.length;i++)
        {
            for (int j=0;j< stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }


        MyClassSample myClassSample = new MyClassSample();

        myClassSample = ob.setMyObject();

        myClassSample.display();

    }
}
