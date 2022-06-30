package CoreJava.Arrays.Opps.Methods;

public class Exam {
    public String name;
    public int score1;
    public int score2;
    public int score3;

    public Exam(String n, int s1, int s2, int s3) {
        name = n;
        score1 = s1;
        score2 = s2;
        score3 = s3;
    }

    public void displayGreeting() {
        System.out.println(" Welcome " + name + " !");
    }

    public int getTotalScore() {
        int res = score1 + score2 + score3;
        return res;
    }

    public int calculateTotal(int s1, int s2, int s3){
        int res1 = s1 + s2 + s3;
        return res1;
    }

    public static String[] convertToArray(String s1,String s2){
        String[] arr={s1,s2};
        return arr;
    }

}
