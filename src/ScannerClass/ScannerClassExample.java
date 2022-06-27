package ScannerClass;

import java.util.Scanner;

public class ScannerClassExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the byte value");
        byte b=sc.nextByte();

        System.out.println("Enter the short value");
        short s=sc.nextShort();

        System.out.println("Enter the int value");
        int i=sc.nextInt();

        System.out.println("Enter the long value");
        long l=sc.nextLong();

        System.out.println("Enter the float value");
        float f=sc.nextFloat();

        System.out.println("Enter the double value");
        double d=sc.nextDouble();

        System.out.println("Enter the True/False value");
        boolean flag=sc.hasNextBoolean();
sc.close();
        System.out.println(" Byte Value  "+b);
        System.out.println(" short Value  "+s);
        System.out.println(" int Value  "+i);
        System.out.println(" long Value  "+l);
        System.out.println(" float Value  "+f);
        System.out.println(" double Value  "+d);
        System.out.println(" boolean Value  "+flag);


    }
}
