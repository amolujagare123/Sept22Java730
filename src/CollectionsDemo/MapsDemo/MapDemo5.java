package CollectionsDemo.MapsDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo5 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(12,"amol");
        hm.put(42,"rahul");
        hm.put(55,"ravi");
        hm.put(67,"rajesh");
        hm.put(77,"rajesh");
        hm.put(78,"amit");

        System.out.println("hm="+hm);

        Set keySet = hm.keySet();
        System.out.println("keySet="+keySet);

        Collection values = hm.values();
        System.out.println("values="+values);

        Set entrySet = hm.entrySet();
        System.out.println("entrySet="+entrySet);


    }
}
