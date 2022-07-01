package Assesment;

import com.sun.source.tree.BreakTree;

import java.util.Stack;

public class AssessmentTest {


    public static int evaluate(String str) {

        char[] bucket = str.toCharArray();
        String specialCharacter = "(*+-/)";
        Stack<Integer> num = new Stack<>();
        Stack<Character> c = new Stack<>();
        for (int i = 0; i < bucket.length; i++) {
            if (Character.isDigit(bucket[i])) {
                num.push(Integer.parseInt(String.valueOf((bucket[i]))));
            } else if (specialCharacter.contains(Character.toString(bucket[i]))) {
                c.push(bucket[i]);
            }else if (bucket[i] == '(') {
                c.push((bucket[i]));
            } else if (bucket[i] == ')') {
                if(c.peek()!='('){
                    num.push(sum(c.pop(), num.pop(), num.pop()));
                    c.pop();
                }
            }
                while (!c.empty() && num.size()>=2)
                    System.out.println(num.push(sum(c.pop(), num.pop(), num.pop())));
        }
        System.out.println(num);
        System.out.println(c);
        return num.pop();
    }

    public static int sum(char op,int b,int a){
        switch (op){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Result =" +AssessmentTest.evaluate("((1+2)*(3+4))"));

    }
}
