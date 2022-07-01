package Assesment;

import java.util.Stack;

 public class Assesment1 {


    public static int evaluate(String str) {

        char[] bucket =str.toCharArray();
        Stack<Integer> num = new Stack<>();
        Stack<Character> c = new Stack<>();
        for (int i = 0; i < bucket.length - 1; i++) {
            if (Character.isDigit(bucket[i])) {
                num.push(Integer.parseInt(String.valueOf(bucket[i])));
            } else if (bucket[i] == '(') {
                c.push((bucket[i]));
            } else if (bucket[i] == ')') {
                c.push((bucket[i]));
                if(c.peek()!='('){
                    num.push(sum(c.pop(), num.pop(), num.pop()));
                    c.pop();
                }
            }
            else if (bucket[i] == '+') {
                c.push((bucket[i]));
                if (!num.isEmpty() && num.size()==2) {
                    num.push(sum(c.pop(), num.pop(), num.pop()));
                }
            } else if (bucket[i] == '-' && num.size()==2) {
                c.push((bucket[i]));
                num.push(sum(c.pop(), num.pop(), num.pop()));

            } else if (bucket[i] == '*'&& num.size()==2) {
                c.push((bucket[i]));
                num.push(sum(c.pop(),num.pop(),num.pop()));
            } else if (bucket[i] == '/'&& num.size()==2) {
                c.push((bucket[i]));
                num.push(sum(c.pop(),num.pop(),num.pop()));
            }
        }
        return num.pop();
    }
    public static int sum(char op,int a,int b){
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
        System.out.println(Assesment1.evaluate("(1+2)*(3+4)"));

    }
}
