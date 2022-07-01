package CoreJava.ScannerClass;

import java.util.Scanner;

public class ScannerClassExample1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Provide sentence and i will repeat it ");
        String str = sc.nextLine();
        sc.close();

        System.out.println(str);
    }
}
