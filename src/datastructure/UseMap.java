package datastructure;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        Map<String,Integer> studentAge=new HashMap<>();

        //adding key and value
        studentAge.put("Aylan",26);
        studentAge.put("Ceci",26);
        studentAge.put("Amina",27);
        studentAge.put("Ouarda",28);

        // get element
        System.out.println(studentAge.get("Ouarda"));

        // remove element
        studentAge.remove("Amina");


        for (String st: studentAge.keySet()){
            System.out.println("student age is : "+st);
        }




    }

}
