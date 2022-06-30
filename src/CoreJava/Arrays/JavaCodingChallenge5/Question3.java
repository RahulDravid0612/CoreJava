/**
 * Below is One-dimensional array code:
 * char arr [] = new char[] {'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};
 *
 * Write the code to search for particular character in above array.
 * If I search for 'B', then output should be: "B found!"
 * If I search for 'E', then output should be: "E Not found!"
 */
package CoreJava.Arrays.JavaCodingChallenge5;

public class Question3 {
    public static void main(String[] args) {
        char arr[] ={'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};
        char search='B';
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==search)
                 flag=true;
        }
        if(flag==true)
            System.out.println(search+ " Found");
        else
            System.out.println(search +" Not Found");
    }
}
