package CoreJava.Arrays.ControlFlow;

public class ForLoopExample2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i=i+1)
        {
            System.out.println("Hello" + i);
        }
        System.out.println("------------------------------");
        for (int i = 0; i <= 5;)
        {
            System.out.println("Hello" + i++);
        }
        System.out.println("------------------------------");
        for (int i = 0; i <= 5;System.out.println("Hello" + i++))
        {
        }

    }
}
