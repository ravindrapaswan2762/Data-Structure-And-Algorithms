package datastructureAndALGORITHM.stackANDqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class postFixEvaluationAndConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> evaluate = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<String> infix = new Stack<>();

        for (int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);


            if(ch=='-' ||ch=='+' ||ch=='*' ||ch=='/'){
                int val2 = evaluate.pop();
                int val1 = evaluate.pop();
                int evaluation = eval(val1, val2, ch);
                evaluate.push(evaluation);

                String pval2 = prefix.pop();
                String pval1 = prefix.pop();
                String pval = ch + pval1 + pval2;
                prefix.push(pval);

                String ival2 = infix.pop();
                String ival1 = infix.pop();
                String ival = "("+pval1 +ch+ pval2+")";
                infix.push(ival);

            }
            else{
                evaluate.push(ch-'0');
                prefix.push(ch+"");
                infix.push(ch+"");
            }
        }
        System.out.println(evaluate.pop());
        System.out.println(infix.pop());
        System.out.println(prefix.pop());
    }
    public static int eval(int val1, int val2, char optors){
        if (optors=='+'){
            return val1+val2;
        }
        else if (optors=='-'){
            return val1-val2;
        }
        else if (optors=='*'){
            return val1*val2;
        }
        else if (optors=='/'){
            return val1/val2;
        }
        return 0;
    }

}
