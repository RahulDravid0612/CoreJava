package CoreJava.Arrays;

public class TwoDimentionalArrayExample1 {
    public static void main(String[] args) {
        // 1-D Array
        String[] day1 = {"Monday", "Tuesday", "Wednesday", "thursday", "Friday", "saturday", "Sunday"};

        // 2-D Array

        String[][] Day2 = new String[][]{{"1", "Monday"},
                {"2", "Tuesday"},
                {"3", "Wednesday"},
                {"4", "thursday"},
                {"5", "Friday"},
                {"6", "saturday"},
                {"7", "Sunday"}};

        for (int i = 0; i < day1.length; i++) {
            System.out.println(day1[i]);
        }
        System.out.println("---------------------------------");

        for (int i = 0; i < Day2.length; i++) {
            for (int j = 0; j < Day2[i].length; j++) {
                System.out.print(Day2[i][j]+" ");
            }
            System.out.println();
        }

    }
}