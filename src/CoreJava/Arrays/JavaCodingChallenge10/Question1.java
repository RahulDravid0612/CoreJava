/**
 * Write a method that takes an int [] as a parameter and sorts the array elements in ascending order.
 * For example, if an int array object has elements {8, 1000, -10, 76, 276} and we pass it to the method,
 * then method will correct the element order in the array as: {-10, 8, 76, 276, 1000}.
 */
package CoreJava.Arrays.JavaCodingChallenge10;

public class Question1 {
    int swap=0;
    public void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
            }
            }
        }
    }

    public void sortPrint(int[] arr){
        for (int x:arr) {
            System.out.print(" "+x);
        }
    }
}
