package datastructureAndALGORITHM.stackANDqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PrefixEvaluationAndConversion {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = "-+2/*6483";

        Stack<Integer> evaluate = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> postfix = new Stack<>();


        for (int i = exp.length()-1; i>=0; i--){
            char ch = exp.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/'){

                int eval1 = evaluate.pop();
                int eval2 = evaluate.pop();
                int eval = evaluation(eval1, eval2, ch);
                evaluate.push(eval);

                String ival1 = infix.pop();
                String ival2 = infix.pop();
                String ival = "("+ival1 +ch+ ival2+")";
                infix.push(ival);

                String pval1 = postfix.pop();
                String pval2 = postfix.pop();
                String pval = pval1 + pval2 +ch;
                postfix.push(pval);

            }
            else {
                evaluate.push(ch - '0');
                postfix.push(ch+"");
                infix.push(ch+"");
            }
        }
        System.out.println(evaluate.pop());
        System.out.println(infix.pop());
        System.out.println(postfix.pop());

    }
    public static int evaluation(int val1, int val2, char optors){
        if (optors=='+'){
            return val1+val2;
        }
        else if (optors=='-'){
            return val1-val2;
        }
        else if (optors=='*'){
            return val1*val2;
        }
        else {
            return val1/val2;
        }

    }
}
