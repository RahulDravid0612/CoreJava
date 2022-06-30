package CoreJava.Arrays.JavaCodingChallenge10;

public class Question1Test {
    public static void main(String[] args) {
        int[] arr={8, 1000, -10, 76, 276};
        System.out.println(" Before sorting..");
        for (int x:arr) {
            System.out.print(" "+x);
        }

        Question1 q1=new Question1();
        q1.sort(arr);

        System.out.println("\n After sorting..");
        q1.sortPrint(arr);

    }
}
