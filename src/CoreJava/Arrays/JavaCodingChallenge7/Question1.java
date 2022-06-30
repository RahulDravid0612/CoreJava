/**
 * Write nested enhanced for-loop to iterate through following 2-Dimensional array:
 * char [][] arr = {
 * {'*'},
 * {'*', '*'},
 * {'*', '*', '*'},
 * {'*', '*', '*', '*'},
 * {'*', '*', '*', '*', '*'},
 * {'*', '*', '*', '*', '*', '*'},
 * {'*', '*', '*', '*', '*', '*', '*'},
 * };
 * Following output is expected:
 * *
 * **
 * ***
 * ****
 * *****
 * ******
 * *******
 */
package CoreJava.Arrays.JavaCodingChallenge7;

public class Question1 {
    public static void main(String[] args) {
        char [][] arr = {
                {'*'},
                {'*', '*'},
                {'*', '*', '*'},
                {'*', '*', '*', '*'},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*', '*', '*'},};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
