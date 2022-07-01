package CoreJava.Opps.Variables;

public class StaticVariableShadowing {
    public static int i=200;

    public static void main(String[] args) {
        System.out.println(StaticVariableShadowing.i);
        System.out.println(i);

        for (int i = 0; i < 1; i++) {
            System.out.println(i);
        }
            System.out.println(i);
            {
                String i="Hello";
                System.out.println(i);
            }
            double i = 323.3;
            System.out.println(i);
        }
    }

