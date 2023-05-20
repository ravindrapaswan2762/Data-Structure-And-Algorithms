package talentBattle100days;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class removeBrackets_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Stack<Character> st = new Stack<>();
        for (int i=0; i<s.length(); i++){
            st.push(s.charAt(i));
        }

        String res = "";
        while (st.size()>0){
            char ch = st.pop();
            if (ch =='(' || ch==')' || ch=='[' ||ch==']'|| ch=='{' ||ch=='}'){
                res = res+"";
            }else {
                res = res+ch;
            }
        }
        StringBuilder sb = new StringBuilder(res);
        sb.reverse();
        System.out.println(sb);
    }
}
