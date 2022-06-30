package CoreJava.Arrays.ScannerClass;

public class StringTextExample {
    public static void main(String[] args) {

        String s1="java";
        String s2="Java";

        System.out.println(s1.length());
        System.out.println(s2.length());

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("java"));
        System.out.println("Java".equals(s2));
        System.out.println("java".equals("java"));

        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(s1==s2);
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        System.out.println(" \n\r\t  rahul\tdravid\n\f".trim());

    }
}
