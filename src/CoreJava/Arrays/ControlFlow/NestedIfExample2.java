package CoreJava.Arrays.ControlFlow;

public class NestedIfExample2 {
    public static void main(String[] args) {
        int duration=3;
        if (duration>2)
            if(duration>3)
                if(duration>7)
                    System.out.println("A");
            else
                System.out.println("B");
        else
            System.out.println("C");
    }
}
