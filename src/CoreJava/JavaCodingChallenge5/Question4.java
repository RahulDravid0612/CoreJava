/**
 * short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
 * Above array stores the scores of a batsman in his last 10 innings in the game of cricket.
 * To know more about cricket, you can visit Wikipedia link: https://en.wikipedia.org/wiki/Cricket
 * If score is greater than or equal to 50 but less than 100, it is regarded as half-century.
 * If score is greater than or equal to 100 but less than 200, it is regarded as a century.
 * If score is greater than or equal to 200, it is regarded as a double-century.
 *
 * Write the code to print the number of half-centuries, centuries and double-centuries scored
 * by the batsman.
 */
package CoreJava.JavaCodingChallenge5;

public class Question4 {
    public static void main(String[] args) {
         short[] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
            int[] result=new int[3];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i]>50 && scores[i]<100) {
                result[0]++;
            } else if (scores[i]>100 && scores[i]<200) {
                result[1]++;
            } else if ((scores[i]>200 && scores[i]<300)) {
                result[2]++;
            }
        }
        System.out.println(result[0]+" Half-Century");
        System.out.println(result[1]+" Century");
        System.out.println(result[2]+" Double-Century");
    }
}
