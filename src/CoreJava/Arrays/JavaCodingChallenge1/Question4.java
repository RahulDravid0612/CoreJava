/**
 * Write a java program for following logic.
 *     if marks < 60, then print "Fail"
 *     if marks >= 60 but less than 90 , then print "Pass"
 *     if marks >= 90, then print "Passed with Distinction"
 *
 *      solve Question using ternary operator (?:).
 */
package CoreJava.Arrays.JavaCodingChallenge1;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();

        String a = (marks < 60) ? "Fail" :(marks >= 60 && marks<= 90) ? "pass" : "Distinction";
        //String a = (marks < 60) ? (marks >=90) ? "Distinction" : "pass" : "Fail";
        System.out.println(a);


    }
}

