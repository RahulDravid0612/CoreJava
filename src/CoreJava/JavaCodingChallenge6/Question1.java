/**
 * Write a java program to create a 2-Dimensional array of 8 * 8 size [to resemble chess board] and
 * initialize all the array elements starting from 1 till 64 (using for loop) as follows
 */
package CoreJava.JavaCodingChallenge6;

public class Question1 {
    public static void main(String[] args) {
        int[][] arr=new int[8][8];
        int cnt=1;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]=cnt;
                cnt++;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
