package CoreJava.JavaCodingChallenge9;

public class Question2Test {
    public static void main(String[] args) {
        Question2 a1 = new Question2();
        a1.print();

        Question2 a2 = new Question2("test");
        a2.print();

        Question2 a3 = new Question2(9876.000873);
        a3.print();

        Question2 a4 = new Question2("test", 5.6);
        a4.print();
    }
}
