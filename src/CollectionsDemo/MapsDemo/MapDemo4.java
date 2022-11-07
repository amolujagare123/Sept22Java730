package CollectionsDemo.MapsDemo;

import java.util.HashMap;

public class MapDemo4 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        System.out.println("isEmpty="+hm.isEmpty()); // true
        hm.put(12,"amol");
        hm.put(42,"rahul");
        hm.put(55,"ravi");
        hm.put(67,"rajesh");
        hm.put(77,"rajesh");
        hm.put(78,"amit");
        System.out.println("isEmpty="+hm.isEmpty()); // false

        System.out.println("hm="+hm);

        System.out.println("size="+hm.size());

        System.out.println(hm.containsKey(97));

        System.out.println(hm.containsValue("rajesh1"));

        hm.clear();

        System.out.println("hm="+hm);


    }
}
