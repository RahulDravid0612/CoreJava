package CoreJava.Arrays.ScannerClass;

import java.util.Scanner;

public class ScannerClassExample3 {
    public static void main(String[] args) {
        //String str = "Rahul Dravid ";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char value  ");
        String str =sc.nextLine();
        System.out.println(str.charAt(0));
    }
}
