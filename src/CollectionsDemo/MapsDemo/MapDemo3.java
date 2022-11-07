package CollectionsDemo.MapsDemo;

import java.util.HashMap;

public class MapDemo3 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(12,"amol");
        hm.put(42,"rahul");
        hm.put(55,"ravi");
        hm.put(67,"rajesh");
        hm.put(77,"rajesh");
        hm.put(78,"amit");

        System.out.println("hm="+hm);

        System.out.println(hm.get(77));

        hm.remove(55);

        System.out.println("hm="+hm);


    }
}
