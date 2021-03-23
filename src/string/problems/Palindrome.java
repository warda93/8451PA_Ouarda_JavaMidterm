package string.problems;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.
         */
        String string;
        StringBuilder reverse = new StringBuilder(" ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        string = sc.nextLine();

        int length = string.length();

        for ( int i = length - 1; i >= 0; i-- )
            reverse.append(string.charAt(i));

        if (string.equals(reverse.toString()))
            System.out.println(string+" is a palindrome");
        else
            System.out.println(string+" is not a palindrome");

    }
}
