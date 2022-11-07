package CollectionsDemo.MapsDemo;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lhm  = new LinkedHashMap();

        lhm.put(67,"rajesh");
        lhm.put(42,"rahul");
        lhm.put(78,"amit");
        lhm.put(12,"amol");
        lhm.put(55,"ravi");
        lhm.put(77,"rajesh");


        System.out.println("hm="+lhm);
    }
}
