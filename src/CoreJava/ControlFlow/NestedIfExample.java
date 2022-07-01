package CoreJava.ControlFlow;

public class NestedIfExample {
    public static void main(String[] args) {
        int age=11;
        double height=35;
        if(age>10)
        {
            if(height>=46)
                System.out.println("Enjoy indian jones adventure");
        }
        else
            System.out.println("Sorry! your age is less than 10");
    }

}
