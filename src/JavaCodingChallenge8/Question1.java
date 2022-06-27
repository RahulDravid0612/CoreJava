/**
 * Write a program to ask user to enter either Y or N.
 * User can enter in lower case or upper case.
 * If user enters Y or y, then display “Welcome!” and terminate the program.
 * If user enters N or n, then display “Good Bye!” and terminate the program.
 * If user enters any other character, then display “Please provide correct input.” and ask user to enter
 * either Y or N.
 * If user enters more than one character such as yes/no/abc, then display “Please provide only one
 * character.” and ask user to enter either Y or N.
 * Program should not be terminated until user provides Y/y/N/n.
 * NOTE: Provide the solution under “challenge8” package and accept input as character.
 * Result of two separate executions:
 * Enter either Y/N: yes
 * Please provide only one character.
 * Enter either Y/N: a
 * Please provide correct input.
 * Enter either Y/N: y
 * Welcome!
 * Enter either Y/N: no
 * Please provide only one character.
 * Enter either Y/N: n
 * Good Bye!
 */
package JavaCodingChallenge8;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter either Y/N: ");
            String str = scanner.next();
            if(str.length() != 1) {
                System.out.println("Please provide only one character.");
                continue;
            }
                char a=str.charAt(0);

            if(a == 'y' || a == 'Y') {
                System.out.println("Welcome!");
                break;
            } else if(a == 'n' || a == 'N') {
                System.out.println("Good Bye!");
                break;
            } else {
                System.out.println("Please provide correct input.");
                continue;
            }
        }
        scanner.close();
    }
}
