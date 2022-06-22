/**
 * Write a program using while loop to print Even numbers from 1 to 100.
 */
package JavaCodingChallenge2;

public class Question3 {
    public static void main(String[] args) {
        int num1 =1;
        int num2 = 100;
        while (num1 <= num2) {
            if (num1 % 2 == 0) {
                System.out.println(num1);
            }
            num1++;
        }
    }
}
