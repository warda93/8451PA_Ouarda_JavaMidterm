package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */
        Queue<Integer> employeeSalary=new LinkedList<>();
        // add element
        employeeSalary.add(30000);
        employeeSalary.add(48555);
        employeeSalary.add(45333);
        employeeSalary.add(14000);
        employeeSalary.add(800000);
        employeeSalary.add(200000);
        employeeSalary.add(140000);

        // print all element
        System.out.println(employeeSalary);

        // remove an element
        employeeSalary.remove(2);

        // retrieve all element by using for each loop
        for(Integer i:employeeSalary){
            System.out.println("salary : "+i);
        }

        System.out.println("********* element method :variableName.element();");

        // VariableName.element(); ===> peek the first element (value)in the list
        System.out.println(employeeSalary.element());

        System.out.println("********* peek method *** variableName.peek(); ");

        // VariableName.peek(); ===> peek the first element (value)in the list
        System.out.println(employeeSalary.peek());


        System.out.println("************* Poll() Method ********************************");

        // variableName.poll(); ++> pole method select(peek) the value  and remove it at the same time
        System.out.println(employeeSalary.poll());   // peak and remove

        System.out.println("***************  retrieve all value after poll *******************************");

        Iterator iterator=employeeSalary.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Object obj : employeeSalary) {
            System.out.println("Salary after poll is : "+obj);
        }


    }

}




