package CollectionsDemo.MapsDemo;

import java.util.HashMap;

public class MapDemo1 {

    public static void main(String[] args) {

        HashMap hm = new HashMap();

        hm.put(12,"amol");
        hm.put(42,"rahul");
        hm.put(55,"ravi");
        hm.put(67,"rajesh");
        hm.put(77,"rajesh");
        hm.put(77,"amit");
        hm.put('j',89);
        hm.put(true,null);
        hm.put(67,89.98);
        hm.put(87,"ravi");
        hm.put(82,null);
        hm.put(83,null);
        hm.put(null,"ravi1");
        hm.put(null,"ravi2");

        System.out.println(hm);
    }
}
