package JavaCodingChallenge9;

public class Question3 {
    public String msg1;
    public String msg2;

    public Question3() {
            this("Hello", "World!");
    }

    public Question3(String s1, String s2) {
        msg1 = s1;
        msg2 = s2;
    }

    public void print() {
        System.out.println(msg1 + " " + msg2);
    }
}
