package CoreJava.Opps.Methods;

public class ExamTest {
    public static void main(String[] args) {
        Exam e1=new Exam("Rahul",67,45,54);
            e1.displayGreeting();

            System.out.println("----------------------------------------------");
            int res=e1.getTotalScore();
            System.out.println(res);
            System.out.println("----------------------------------------------");
            int res1=e1.calculateTotal(45,54,45);
            System.out.println(res1);
            System.out.println("----------------------------------------------");
            int res2=e1.calculateTotal(e1.score1,e1.score2,e1.score3);
            System.out.println(res2);
            System.out.println("----------------------------------------------");
           String[] arr= Exam.convertToArray("one","two");
        for (String s:arr) {
            System.out.println(s);
        }



    }
}
