package CoreJava.ControlFlow;

public class ReturnExample
{
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if(i==2)
                return;
        }
    }
}
