/**
 * Following code creates an asymmetrical 2-Dimensional int array:
 * int [][] arr = {
 * {9, 76, 17, 39},
 * {8, 87},
 * {16, 99, 231},
 * {187}
 * };
 * Write logic to store all the array elements of 2-Dimensional array to 1-Dimensional array.
 * You should have following 1-D array:
 * 9 76 17 39 8 87 16 99 231 187
 * Finally write code to print all the elements of above One-Dimensional array.
 */
package CoreJava.JavaCodingChallenge6;

public class Question4 {
    public static void main(String[] args) {
        int [][] arr = {{9, 76, 17, 39}, {8, 87}, {16, 99, 231}, {187}};

        int[] arr1= new int[10];
        int cnt=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr1[cnt]=arr[i][j];
                cnt++;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
