/**
 * Write a java program to accept more than 1 digit as command-line arguments and display the
 * highest digit to the user.
 * For example, if user passes 9, 14, 0, 23, 98, 2, 45
 * Output should be: Highest digit is: 98
 */
package CoreJava.JavaCodingChallenge7;

public class Question4 {
    public static void main(String[] args) {
        /*int[] temp=new int[10];
        for (int i = 0; i < args.length; i++) {
            int arr= Integer.parseInt(args[i]);
            temp[i]=arr;
        }
        int Highest=temp[0];
        for (int i = 0; i < temp.length; i++) {
            if(Highest<temp[i])
            {
                Highest=temp[i];
            }
        }
        System.out.println("highest number = "+ Highest);
*/
        int max=0;
        for (String x:args) {
            if (Integer.parseInt(x)>max)
            {
                max=Integer.parseInt(x);
            }
        }
        System.out.println("highest number = "+ max);
    }
}
