package CoreJava.Arrays.JavaCodingChallenge8;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
     while(true) {
        System.out.print("Enter either Y/N: ");
        String str = scanner.next();
        if(str.length() != 1) {
            System.out.println("Please provide only one character.");
            continue;
        }

        if(str.equalsIgnoreCase("y") || str.equalsIgnoreCase("Y")) {
            System.out.println("Welcome!");
            break;
        } else if(str.equalsIgnoreCase("n") || str.equalsIgnoreCase("N")) {
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
