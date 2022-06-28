package JavaCodingChallenge9;

public class Question2 {
    public String str;
    public double val;

    public void print() {
        System.out.println("str: " + str + ", val: " + val);
    }
    public Question2() {

    }
    public Question2(String s) {
        str = s;
    }
    public Question2(double d) {
        val = d;
    }

    public Question2(String s,double d) {
        str = s;
        val = d;
    }
}

