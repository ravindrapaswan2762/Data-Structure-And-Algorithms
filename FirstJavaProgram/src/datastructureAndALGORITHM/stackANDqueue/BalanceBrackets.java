package datastructureAndALGORITHM.stackANDqueue;

import java.util.Scanner;
import java.util.Stack;

public class BalanceBrackets {

    public static boolean handleClosingBrackets(Stack<Character> st, char corespondingCHAR){
        if (st.size()==0){
            return false;
        }
        else if (st.peek() != corespondingCHAR){
            System.out.println("False");
            return false;
        }
        else {
            st.pop();
            return true;
        }
    }

    public static void main(String[] args) {
//          openning brackets--> push.
//          clossing brackets--> judging and pop.

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
//          else if other character then ignored, only judge with brackets.

            else if (ch == ')'){
                boolean val = handleClosingBrackets(st, '(');
                if (val==false){
                    System.out.println(val);
                    return;
                }
            }
            else if (ch == ']'){
                boolean val = handleClosingBrackets(st, '[');
                if (val==false){
                    System.out.println(val);
                    return;
                }
            }
            else if (ch == '}'){
                boolean val = handleClosingBrackets(st, '{');
                if (val==false){
                    System.out.println(val);
                    return;
                }
            }
        }
        if (st.size()==0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

}
