/**
 * Write a program for following logic:
 * Print all the odd numbers in comma separated form from 1 till end (you may change it):
 * if end = 10, OUTPUT = 1, 3, 5, 7, 9
 * if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11
 *
 * You should use while loop and if - else statements. Note that, there should not be any comma after last digit
 */
package CoreJava.Arrays.JavaCodingChallenge2;

public class Question4 {
    public static void main(String[] args) {
        int num1 =2;
        int num2 = 10;
        while (num1 <= num2) {
            if (num1 % 2 != 0) {
                System.out.print(num1);
            }
            if (num1+1 != num2 && num1 % 2 != 0) {
                System.out.print(", ");
            }
            num1++;

        }
    }
}
