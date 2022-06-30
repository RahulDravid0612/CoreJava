/**
 * print the table of 12 using while loop;
 */
package CoreJava.Arrays.JavaCodingChallenge3;

public class Question2 {
    public static void main(String[] args) {
        int n=12;
        int cnt=1;
        while (cnt<=10)
        {
            System.out.println(n + " X " + cnt + " = "+ (n*cnt));
            cnt++;
        }
    }
}
