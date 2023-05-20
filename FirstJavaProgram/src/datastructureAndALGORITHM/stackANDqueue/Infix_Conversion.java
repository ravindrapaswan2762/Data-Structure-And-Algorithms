package datastructureAndALGORITHM.stackANDqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Infix_Conversion {
    public static void main(String[] args) throws IOException {
//      INFIX LIKE BODMAS EXPRESSION solving - ( (a+b) * (c+d) / (a+b) ), understanding by human.

//      PREFIX - OPERANDS AFTER OPERATORS[a+b = +ab] - understanding by machines. doesn't depend on
//                                          brackets for priorty checking.
//      POSTFIX - OPERATORS AFTER OPERANDS[a+b = +ab] - understanding by machines. doesn't depend on
//                                          brackets for priorty checking.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<String> prefix = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i=0; i<exp.length(); i++){

            char ch = exp.charAt(i);

            if (ch == '('){operators.push(ch);}

            else if ((ch >= '0' && ch <= '9') || (ch >='a' && ch <='z')|| (ch>='A' && ch<='Z')){
                prefix.push(ch+"");
                postfix.push(ch+"");
            }
            else if (ch == ')'){
                while (operators.peek() != '('){
                    char opval = operators.pop();
                    String preVal2 = prefix.pop();
                    String preVal1 = prefix.pop();
                    String preVal =  opval + preVal1 + preVal2;
                    prefix.push(preVal);

                    String popVal2 = postfix.pop();
                    String popVal1 = postfix.pop();
                    String postVal = popVal1 + popVal2 + opval;
                    postfix.push(postVal);
                }
                operators.pop();
            }
            else if (ch=='+' || ch =='-' ||ch=='*' ||ch=='/'){
                while ( operators.size()>0 && operators.peek()!='('
                        && precedence(ch)<=precedence(operators.peek())){

                    char opval = operators.pop();

                    String preVal2 = prefix.pop();
                    String preVal1 = prefix.pop();
                    String preVal =  opval + preVal1 + preVal2;
                    prefix.push(preVal);

                    String popVal2 = postfix.pop();
                    String popVal1 = postfix.pop();
                    String postVal = popVal1 + popVal2 + opval;
                    postfix.push(postVal);
                }
                operators.push(ch);
            }
        }
        while (operators.size()>0){
            char opval = operators.pop();

            String preVal2 = prefix.pop();
            String preVal1 = prefix.pop();
            String preVal =  opval + preVal1 + preVal2;
            prefix.push(preVal);

            String popVal2 = postfix.pop();
            String popVal1 = postfix.pop();
            String postVal = popVal1 + popVal2 + opval;
            postfix.push(postVal);
        }
        System.out.println(prefix.pop());
        System.out.println(postfix.pop());


    }
    public static int precedence(char optors){
        if (optors == '+' || optors == '-'){
            return 1;
        }
        else if (optors == '*' || optors == '/'){
            return 2;
        }
        return 0;
    }
}
