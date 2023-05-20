package datastructureAndALGORITHM.stackANDqueue;

import java.util.Scanner;
import java.util.Stack;

public class DuplicatesBrackets {
    public static void main(String[] args) {
//  ((a+b)+(c+d)),   (a+b)+((c+d))  if presents unwanted brackets then print true otherwise
//  print false
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == ')'){
                if (st.peek()=='('){
                    System.out.println("True");
                    return;
                }
                else {
                    while (st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            }
            else {
                st.push(ch);
            }
        }
        System.out.println("False");
    }
}
