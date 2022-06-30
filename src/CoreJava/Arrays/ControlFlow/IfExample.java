package CoreJava.Arrays.ControlFlow;

public class IfExample {
    public static void main(String[] args) {
        int score = 85;

        if (score > 80)
            System.out.println("Excellent");
            System.out.println(" passed with grade A");


        if (score > 80) {
            System.out.println("Excellent");
            System.out.println(" passed with grade A");
        }

        if (score > 80)
            System.out.println("Excellent");System.out.println(" passed with grade A");

    }
}