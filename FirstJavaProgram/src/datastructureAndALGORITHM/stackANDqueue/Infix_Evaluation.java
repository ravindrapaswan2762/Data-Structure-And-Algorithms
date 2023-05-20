package datastructureAndALGORITHM.stackANDqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Infix_Evaluation {
    public static void main(String[] args) throws IOException {
//      INFIX LIKE BODMAS EXPRESSION solving - ( (a+b) * (c+d) / (a+b) ), understanding by human.

//      CONDITIONS :-
//      if ch == ( --> push in opetors
//      if ch == int val push in operds
//      if ch == ) --> pop untill find (

//      if ch == +,-,*,/ --> pop till three condions.
//                           1 st.size != 0,       2 ch != (,    3 st.peek priorty >= ch

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i=0; i<exp.length(); i++){

            char ch = exp.charAt(i);

            if (ch == '('){
                operators.push(ch);
            }
            else if (Character.isDigit(ch)){
                operands.push(ch-'0');
            }
            else if (ch == ')'){
                while (operators.peek() != '('){
                    char optor = operators.pop();
                    int val2 = operands.pop();
                    int val1 = operands.pop();

                    int opVal = operation(val1, val2, optor);
                    operands.push(opVal);

                }
                operators.pop();
            }
            else if (ch=='+' || ch=='-' || ch=='*'|| ch=='/'){

//              ch is waiting higher priorty operators to solve first.
                while (operators.size()>0 && operators.peek() != '(' &&
                precedence(ch)<=precedence(operators.peek())){

                    char optor = operators.pop();
                    int val2 = operands.pop();
                    int val1 = operands.pop();

                    int opVal = operation(val1, val2, optor);
                    operands.push(opVal);

                }
//              Now, ch is pushing itself.
                operators.push(ch);
            }
        }
//      if operators have extra some items.
        while (operators.size() != 0){
            char optor = operators.pop();
            int val2 = operands.pop();
            int val1 = operands.pop();

            int opVal = operation(val1, val2, optor);
            operands.push(opVal);

        }
        System.out.println(operands.peek());
    }

    public static int precedence(char operator){
        if (operator == '+'){
            return 1;
        }
        else if (operator == '-'){
            return 1;
        }
        else if (operator == '*'){
            return 2;
        }
        else if (operator == '/'){
            return 2;
        }
        return 0;
    }

    public static int operation(int val1, int val2, char operator){
        if (operator == '+'){
            return val1+val2;
        }
        else if (operator == '-'){
            return val1-val2;
        }
        else if (operator == '*'){
            return val1*val2;
        }
        else if (operator == '/'){
            return val1/val2;
        }
        return 0;
    }
}
