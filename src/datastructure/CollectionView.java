package datastructure;

import java.util.HashMap;
import java.util.Map;

public class CollectionView {

    public static void main(String[] args) {
        /*
         Map is created and some data is inserted into it.
         Retrieve the Collection view of the values present in map
         */

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");
        for (Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println("******************************************");
        // second method to retrieve value
        for (Integer in:map.keySet()){
            System.out.println(in+" : " +map.get(in));
        }




    }

}
