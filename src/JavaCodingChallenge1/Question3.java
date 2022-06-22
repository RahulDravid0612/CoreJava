/**
 * Write a logic to print "EVEN" / "ODD" for the numbers.
 * Numbers divisible by 2 are even and numbers not divisible by 2 are odd.
 *
 * Solve Question using ternary operator (?:).
 */
package JavaCodingChallenge1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check even or odd");
        int num=sc.nextInt();

        String a = (num % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(a);

    }
}
