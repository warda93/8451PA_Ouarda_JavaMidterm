package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below
         Should return "10 biological"
         */
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        String[] word = s.split(" ");

        String largestWord = "";
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > largestWord.length()) {
                largestWord = word[i];

            }
        }

        System.out.println(largestWord.length() + " " + largestWord);


    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";

        // Implement here

        return map;
    }
}
