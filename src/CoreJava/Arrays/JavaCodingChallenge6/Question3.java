/**
 * Following code creates an asymmetrical 2-Dimensional int array:
 * int [][] numbers = {
 * {90, 10, 231},
 * {-20, 80, 100, 23, 54},
 * {45, 22},
 * {87, 98, -100, 49, 73, 35, 19}
 * };
 * Write logic to find out highest number in above array.
 */
package CoreJava.Arrays.JavaCodingChallenge6;

public class Question3 {
    public static void main(String[] args) {

        int [][] numbers = {
                {90, 10, 231},
                {-20, 80, 100, 23, 54},
                {45, 22},
                {87, 98, -100, 49, 73, 35, 19}};
        int temp=numbers[0][0];

        for (int i = 0; i <numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(temp<numbers[i][j])
                {
                  temp=numbers[i][j];
                }
            }
        }
        System.out.println("highest number = "+ temp);
    }
}
