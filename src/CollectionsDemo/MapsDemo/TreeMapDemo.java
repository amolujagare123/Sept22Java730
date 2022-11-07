package CollectionsDemo.MapsDemo;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer,String> tm  = new TreeMap();

        tm.put(67,"rajesh");
        tm.put(42,"rahul");
        tm.put(78,"amit");
        tm.put(12,"amol");
        tm.put(55,"ravi");
        tm.put(77,"rajesh");


        System.out.println("hm="+tm);
    }
}
