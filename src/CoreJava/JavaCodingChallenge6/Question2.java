/**
 * Write a java program to create following 2-Dimensional array of 8 * 8 size [to resemble chess board]
 * using Data instantiation:
 */
package CoreJava.JavaCodingChallenge6;

public class Question2 {
    public static void main(String[] args) {
        char[][] arr=new char[8][8];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if((i+j)%2==0)
                {
                    arr[i][j]='W';
                }
                else
                {
                    arr[i][j]='B';
                }
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
