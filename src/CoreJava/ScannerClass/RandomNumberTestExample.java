package CoreJava.ScannerClass;

import java.security.SecureRandom;

public class RandomNumberTestExample {
    public static void main(String[] args) {

        SecureRandom random=new SecureRandom();
        for (int i = 0; i < 100; i++) {

            int num1 = random.nextInt(10);
            System.out.println("number 1 == " + num1);

            int num2 = random.nextInt(10);
            System.out.println("number 2 == " + num2);
        }
    }
}
