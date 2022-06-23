/**
 * Print the multiples of 5 starting from 200 to 5 with following restrictions:
 * 1. Use for loop
 * 2. Don't use modulus (%) operator to check whether number is divisible by 5 or not.
 */
package JavaCodingChallenge3;

public class Question4 {
    public static void main(String[] args) {
        for (int i = 200; i <= 5 ; i--) {
            int res=i/5;
            System.out.println(res);
        }
    }
}
