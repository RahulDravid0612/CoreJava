package CoreJava.Arrays.ControlFlow;

public class BreakExample
{
    public static void main(String[] args) {
        int upperbound=20;
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
            if(i==upperbound)
                break;
        }
    }
}
