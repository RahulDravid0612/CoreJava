/**
 * Print following chess board using nested for loops.
 * W B W B W B W B
 * B W B W B W B W
 * W B W B W B W B
 * B W B W B W B W
 * W B W B W B W B
 * B W B W B W B W
 * W B W B W B W B
 * B W B W B W B W
 */
package JavaCodingChallenge4;

public class Question4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if ((i + j) % 2 != 0)
                    System.out.print(" B ");
                else
                    System.out.print(" W ");
            }
            System.out.println();
        }
    }
}
