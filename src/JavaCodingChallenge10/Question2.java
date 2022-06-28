/**
 * Same as Question 1. java.util.Arrays class has various utility methods to work with Arrays.
 * Instead of writing your own logic to sort the passed int [] object in the method, you have to use a
 * method from java.util.Arrays class to solve it.
 */
package JavaCodingChallenge10;

import java.util.Arrays;
public class Question2 {
    public static void main(String[] args) {
        int[] arr={8, 1000, -10, 76, 276};
        System.out.println(" Before sorting..");
        for (int x:arr) {
            System.out.print(" "+x);
        }
        Arrays.sort(arr);
        System.out.println("\n After sorting..");
        for (int x:arr) {
            System.out.print(" "+x);
        }
    }
}
