package CoreJava.ControlFlow;

public class SwitchCase1 {
    public static void main(String[] args) {
        byte var = 65;
        final byte a = 10; //compile time constant
        final byte b; // not compile time constant because initialisation is in next line
        b = 20;

        switch (var) {
            case a:
                System.out.println(1);
                break;
            case a * 5: // value is 50, compile time constant and byte range
                System.out.println(2);
                break;
             /* case a * 20: // value is 500, compile time constant but outside byte range
                System.out.println(3);
                break; */
            /*  case b: // not compile time constant
                System.out.println(4);
                break; */
            case '\u0041': // Character 'A', decimal value 65 is with in the byte range
                System.out.println(5);
                break;

        }
    }
}
