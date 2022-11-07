package CollectionsDemo.MapsDemo;

import java.util.HashMap;

public class MapDemo2 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(12,"amol");
        hm.put(42,"rahul");
        hm.put(55,"ravi");
        hm.put(67,"rajesh");
        hm.put(77,"rajesh");
        hm.put(78,"amit");

        System.out.println("hm="+hm);

        HashMap<Integer,String> hm1 = new HashMap<>();

        System.out.println("hm1="+hm1);

        hm1.putAll(hm);

        System.out.println("hm1="+hm1);




    }
}
