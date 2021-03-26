package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */
        // create Array lis
        ArrayList<String> phones = new ArrayList<>();
        // add value
        phones.add("Iphone");
        phones.add("Samsung");
        phones.add("LG");
        phones.add("Motorola");
        phones.add("ZTE Blade");

        // Print all elements
        System.out.println(phones);


        //retrieve all value
        System.out.println("***************** retrieve all value by using For each *****************");
        for (String st : phones) {
            System.out.println("phone is " + st);
        }

        // peek method we cannot because its an arrayList\
        //*****************************************************************

        // remove a value by index
        phones.remove(2); // Lg is deleted in this level


        System.out.println("***********  retrieve value after removing  by using Iterator **********************");
        // retrieve all value by using iterator
        Iterator it = phones.iterator();
        while (it.hasNext()) {

            System.out.println("phone : " + it.next());
        }


    }}
