/**
 * Write a logic using switch-case to print "EVEN" / "ODD" for the numbers.
 * Numbers divisible by 2 are even and numbers not divisible by 2 are odd.
 */
package CoreJava.Arrays.JavaCodingChallenge1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check even or odd");
        int num=sc.nextInt();

        switch (num/2)
        {
            case 0:
                System.out.println("Given number is Even");
            default:
                System.out.println("Given number is Odd");
        }

    }
}
