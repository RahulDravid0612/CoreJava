package CoreJava.Arrays.ControlFlow;

public class If_Else_IfElseExample {
    public static void main(String[] args) {
        byte hr = 17;
        if (hr<12)
        {
            System.out.println("Good Morning");
        }
        else if(hr>12 && hr<15)
        {
            System.out.println("Good Afternoon");
        }
        else
        {
            System.out.println("Good Evening");
        }
    }
}
