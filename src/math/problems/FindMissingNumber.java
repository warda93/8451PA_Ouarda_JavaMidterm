package math.problems;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         If n = 10, then array will have 9 elements in the range from 1 to 10.
            For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).

         Write a method to find the missing number from the array.
         */
        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};
        // Calculate n value
        int n = array.length + 1;

        // Calculate Sum of N Number
        // using Math formula n(n+1)/2
        int sumOfNNumbers = sumOfAllNNumbers(n);

        // Calculate Sum of all numbers in input array
        int sumOfInputArray = sumOfAllNNumbers(array);

        // Calculate missing number
        // using subtraction
        int missingNumber = sumOfNNumbers - sumOfInputArray;

        // Print the Missing number
        System.out.println("Missing number in the array is : "
                + missingNumber);
    }

    public static int sumOfAllNNumbers(int n){
        int sum = (n*(n+1))/2;
        return sum;
    }

    public static int sumOfAllNNumbers(int[] input){
        int sum = 0;
        for(int i=0; i < input.length ;i++){
            sum = sum + input[i];
        }
        return sum;


    }
}
