package CoreJava.Arrays.ScannerClass;

import java.util.Scanner;

public class ScannerClassExample2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the 1st number =");
        int n1=sc.nextInt();
        System.out.println("Enter the 2st number =");
        int n2=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the String =");
        String s1=sc.nextLine();
        sc.close();

        System.out.println("1st number is "+n1+" 2nd number is "+n2+" string is "+s1);

    }
}
